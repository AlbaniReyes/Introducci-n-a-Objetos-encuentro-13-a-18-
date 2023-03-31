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
public class EjerE_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese su saldo");
        Cuenta platita = new Cuenta(sc.nextDouble(),"Tobia");
     
        System.out.println("Ingrese la cantidad a extraer");
        platita.retirar_dinero(sc.nextDouble());
        
        System.out.println("su dinero final en la cuenta es: "+platita.getSaldo()+"$");
        
    }
    
}
