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
public class Ejer_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Circunferencia cir1 = new Circunferencia(0);
        
        cir1.crearCircunferencia();
        
        System.out.print("EL AREA ES: ");
        System.out.println(" " + cir1.area());
                
        
        System.out.print("EL PERIMETRO ES: ");
        System.out.println(" " + cir1.perimetro());
        
        

        
        
    }
    
}

