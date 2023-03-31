/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

/**
 *
 * @author Albani
 */
public class Ejer_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Libro l1 = new Libro();
        l1.cargarLibro();
        System.out.println(l1.toString());
        
        System.out.println(" ");
        
        Libro l2 = new Libro(5435,"BAJO LA MISMA ESTRELLA","JOHN GREEN",301);
        l2.toString();
        System.out.println(l2.toString());
        
        
    }
    
    
    
}
