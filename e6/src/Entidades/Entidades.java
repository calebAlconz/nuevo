/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author Notebook
 */
/*
Programa Nespresso. Desarrolle una clase Cafetera con los atributos
capacidadMaxima (la cantidad máxima de café que puede contener la cafetera) y
cantidadActual (la cantidad actual de café que hay en la cafetera). Implemente, al
menos, los siguientes métodos:
• Constructor predeterminado o vacío
• Constructor con la capacidad máxima y la cantidad actual
• Métodos getters y setters.
*/
public class Entidades {
    public int capMax;
    public int canAct;

    public Entidades() {
    }

    public Entidades(int capMax, int canAct) {
        this.capMax = capMax;
        this.canAct = canAct;
    }

    public int getCapMax() {
        return capMax;
    }

    public void setCapMax(int capMax) {
        this.capMax = capMax;
    }

    public int getCanAct() {
        return canAct;
    }

    public void setCanAct(int canAct) {
        this.canAct = canAct;
    }

    @Override
    public String toString() {
        return "Entidades{" + "capMax=" + capMax + ", canAct=" + canAct + '}';
    }
    
    
}
