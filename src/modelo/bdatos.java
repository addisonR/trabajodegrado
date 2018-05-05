
package modelo;

import java.sql.*;
import javax.swing.JOptionPane;

public class bdatos {
    Connection cn;
    String driver= "com.mysql.jdbc.Driver";
    String user="root";
    String password="";
    String url="jdbc:mysql://localhost:3306/tallerprueba";
    
    public bdatos() {
        cn = null;
        try {
            Class.forName(driver);
            cn= DriverManager.getConnection(url,user,password);
            if(cn !=null){
                JOptionPane.showMessageDialog(null,"conexion establecida.");
            }
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("error al conectar"+ e);
        }
    }

    public Connection getCn() {
        return cn;
    }
    
    
}
