/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vista;

import cola.Cola;
import modelo.Personas;

/**
 *
 * @author maria_a.vasquez
 */
public class EjemploCola {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Cola<Personas> colaP=new Cola<>();
        colaP.encolar(new Personas("Maria", "maria_a.vasquez@uao.edu.co"));
        colaP.encolar(new Personas("Valentina", "valen.cardenas@uao.edu.co"));
        colaP.encolar(new Personas("Juan", "juan.velez@uao.edu.co"));
        
        
        System.out.println("Elementos en cola" +colaP.toString());
        
        for (int i =0; i<3; i++){
            if (!colaP.estaVacia()){
                colaP.desencolar();
                System.out.println("Elementos en cola" +colaP.toString());
            }else{
                System.out.println("Cola vacia");
            }
        }         
    }
    
}
