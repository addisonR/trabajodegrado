
package comienzo;

import vista.*;
import modelo.*;
import controlador.*;


public class Comienzo {

    public static void main(String[] args) {
        vista.inicio_sesion view=new inicio_sesion();
        vista.inicio co=new inicio();
        vista.Recontraseña rc=new Recontraseña();
        modelo.iniciosesion in=new iniciosesion();
        modelo.bdatos bd=new bdatos();
        controlador.coniniciosesion con=new coniniciosesion(in, view, co, bd, rc);
        
        view.setVisible(true);
        view.setTitle("Inicio Sesion");
        view.setLocationRelativeTo(null);
        
    }
    
}
