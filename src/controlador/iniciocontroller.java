
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import vista.*;

public class iniciocontroller implements ActionListener{

    inicio ini=new inicio();
    public iniciocontroller() {
        this.ini.menucrear.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==ini.menucrear){
            JOptionPane.showMessageDialog(null, "conectado");
        }        
    }
    
    
}
