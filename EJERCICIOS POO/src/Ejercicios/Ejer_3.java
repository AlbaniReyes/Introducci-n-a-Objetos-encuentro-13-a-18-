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
public class Ejer_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Operacion num = new Operacion(0, 0);
    
        num.crearOperacion();
        
        System.out.println("---------------------");
        
        System.out.println("LA SUMA DE LOS DOS NUMEROS ES: " + num.sumar());
        System.out.println("LA RESTA DE LOS DOS NUMEROS ES: " + num.restar());
        System.out.println("LA MULTIPLICACION DE LOS DOS NUMEROS ES: " + num.multiplicar());
        System.out.println("LA DIVISION DE LOS DOS NUMEROS ES: " + num.dividir());
    
    }
    
}
