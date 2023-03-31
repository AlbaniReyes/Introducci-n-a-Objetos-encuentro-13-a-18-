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
public class Juego {
    private int jugador1;
    private int jugador2;
    private int cantidadIntentos;

    public Juego() {
        this.jugador1= 0;
        this.jugador2= 0;
        this.cantidadIntentos = 3 ;
    }

    public void iniciar_juego(){
        Scanner leer = new Scanner(System.in);
        do {
        System.out.println("JUGADOR 1: PIENSA UN NUMERO");
        int num = (int) (Math.random() * 10 + 1);
            System.out.println(num);
            System.out.println("------");
        int intentos = 0;
        int adivinar=0;
        while (cantidadIntentos > intentos ) {
            System.out.println("JUGADOR 2: INGRESE UN NUMERO");
            adivinar=leer.nextInt();
            intentos++;
            if (adivinar==num){
                System.out.println("FELICIDADES. ADIVINASTE EL NUMERO");
                this.jugador2++;
                break;
            } else if (adivinar>num){
                System.out.println("EL NUMERO INGRESADO DEBERIA SER MENOR");
            } else {
                System.out.println("EL NUMERO INGRESADO DEBERIA SER MAYOR");
            }
            if (cantidadIntentos<=intentos){
            System.out.println("SUPERASTE EL NUMERO DE INTENTOS");
            }
        }
       
        if (adivinar!=num){
            this.jugador1++;
        }
            System.out.println("¿QUIERES SEGUIR JUGANDO? INGRESA S/N");
        } while (leer.next().equalsIgnoreCase("S"));
        
        System.out.println("EL JUGADOR 1 GANO " + this.jugador1 + " veces");
        System.out.println("EL JUGADOR 2 GANO " + this.jugador2 + " veces");
    }
    
    
    
}
