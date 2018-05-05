
package comienzo;

import vista.*;
import modelo.*;
import controlador.*;


public class Comienzo {

    public static void main(String[] args) {
        vista.inicio_sesion view=new inicio_sesion();
        vista.inicio co=new inicio();
        modelo.iniciosesion in=new iniciosesion();
        modelo.bdatos bd=new bdatos();
        controlador.coniniciosesion con=new coniniciosesion(in, view, co, bd);
        
        view.setVisible(true);
        view.setTitle("Inicio Sesion");
        view.setLocationRelativeTo(null);
        
    }
    
}
