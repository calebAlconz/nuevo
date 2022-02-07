/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import Entidades.Entidades;
import java.util.Scanner;

/**
 *
 * @author Notebook
 */
/*
• Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad
máxima.
• Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
cuanto quedó la taza.

• Método vaciarCafetera(): pone la cantidad de café actual en cero.
• Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
recibe y se añade a la cafetera la cantidad de café indicada.
*/
public class servios {
    Scanner leer = new Scanner(System.in);
    public Entidades altaServicios(){
    Entidades cf =new Entidades();
        System.out.println("-----------------------------");
        System.out.println("ingrese cual es la cantidad maxima de la cafetera:");
        cf.setCapMax(leer.nextInt());
        System.out.println("Ingrese la cantidad actual de la cafetera:");
        cf.setCanAct(leer.nextInt());
        System.out.println("-----------------------------");
    return cf;
    
    }
    //• Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad máxima.
    public void llenarCafetera(Entidades cf){
        int resta;
        resta=(cf.getCapMax()-cf.getCanAct());
        System.out.println("la cantidad que hay que aumentarle a la cafetera es de: "+resta);
        cf.setCanAct(cf.getCanAct()+resta);
        System.out.println("Ahora la cantidad actual de la cafetera es de: "+ cf.getCanAct());
        System.out.println("-----------------------------");
    }
    /*
• Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
tamaño de la taza y simula la acción de servir la taza con la capacidad indicada.
    
°Si lacantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
cuanto quedó la taza.
    */
    public void servirTaza(Entidades cf){
        int taza, tazaLlena;
        taza=0;
        tazaLlena=100;
        System.out.println("El tamaño de una taza llena es de :"+tazaLlena+ " y por lo tanto si esta vacia la taza esta en: "+taza);
        System.out.println("como la taza esta vacia hay que llenarla...");
        if(cf.getCanAct()>= tazaLlena){
            cf.setCanAct(cf.getCanAct()-tazaLlena);
            System.out.println("Si!!!, se pudo servir por completo la taza y la cafetera quedo en: "+cf.getCanAct());
        }else{
            System.out.println("La taza no se pudo llenarse por completo, solo se lleno: "+cf.getCanAct());
            
        }
        System.out.println("-----------------------------");
        
    }
    //• Método vaciarCafetera(): pone la cantidad de café actual en cero.
    public void vaciarCafetera(Entidades cf){
        cf.setCanAct(cf.getCanAct()-cf.getCanAct());
        System.out.println("la cafetera se vacio y queda en: "+cf.getCanAct());
        System.out.println("-----------------------------");
    }
    //• Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo recibe y se añade a la cafetera la cantidad de café indicada.
    public void agregarCafe (Entidades cf){
        int cantidad;
        System.out.println("Ingrese la cantidad que decee para llenar la cafetera: ");
        cantidad=leer.nextInt();
        cf.setCanAct(+cantidad);
        System.out.println("Ahora la cantidad actual de la cafetera es de: "+cf.getCanAct());
        System.out.println("-----------------------------");
    }
    
    
}
