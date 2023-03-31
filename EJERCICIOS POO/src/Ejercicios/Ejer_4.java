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
public class Ejer_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Rectangulo rect1 = new Rectangulo(0, 0);
        
        rect1.crearRectangulo();
        rect1.dibujar();
        
        System.out.println("------------");
        System.out.println("LA SUPERFICIE DEL RECTANGULO ES: " + rect1.superficie());
        System.out.println("EL PERIMETRO DEL RECTANGULO ES: " + rect1.perimetro());
        
        
    }
    
}
