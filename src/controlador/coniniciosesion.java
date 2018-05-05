
package controlador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.*;
import vista.*;

public class coniniciosesion implements ActionListener{

    private iniciosesion ini;
    private inicio_sesion in;
    private inicio co;
    private bdatos bd;
    
    public coniniciosesion(iniciosesion ini, inicio_sesion in, inicio co, bdatos bd) {
        this.ini = ini;
        this.in = in;
        this.co = co;
        this.bd = bd;
        this.in.btentrar.addActionListener(this);
    }
    
    public void iniciosesion(){
        String usuario=ini.getUsuario();
        String clave=ini.getClave();
        
        Connection cn=bd.getCn();
        ResultSet rs;
        Statement st;
        String sql="select * from usuario where nombre='"+usuario+"' and contraseña='"+clave+"'";
        try {
            st = cn.createStatement();
            rs = st.executeQuery(sql);
            if(rs.next()){
                JOptionPane.showMessageDialog(null,"Bienvenido");
                co.setVisible(true);
                in.dispose();  
                cn.close();
            }
            else{
                JOptionPane.showMessageDialog(null, "usuario o contraseña erronea");
            }
        } catch (SQLException ex) {
            Logger.getLogger(coniniciosesion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==in.btentrar){
            ini.setUsuario(in.txtnombre.getText());
            ini.setClave(in.txtpass.getText());
            iniciosesion();
        }
    }
    
}
