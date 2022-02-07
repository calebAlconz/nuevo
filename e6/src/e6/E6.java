/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e6;

import Entidades.Entidades;
import com.sun.corba.se.spi.servicecontext.ServiceContexts;
import servicios.servios;

/**
 *
 * @author Notebook
 */
public class E6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        servios cf=new servios();
        Entidades cafe1=cf.altaServicios();
        cf.llenarCafetera(cafe1);
        cf.servirTaza(cafe1);
        cf.vaciarCafetera(cafe1);
        cf.agregarCafe(cafe1);
    }
    
}
