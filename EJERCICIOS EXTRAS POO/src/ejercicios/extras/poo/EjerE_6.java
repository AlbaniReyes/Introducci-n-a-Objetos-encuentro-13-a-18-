/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios.extras.poo;

import java.util.Scanner;

/**
 *
 * @author Albani
 */
public class EjerE_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese nombre, edad y su salario");
        
        Empleado empl = new Empleado(sc.next(),sc.nextInt(),sc.nextDouble());
        
        empl.calcular_aumento();
        System.out.println("su salario final es: "+empl.getSalario());
        
    }
    
}
