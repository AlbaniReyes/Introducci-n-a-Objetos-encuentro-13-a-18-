/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

import Entidad.Persona;
import java.util.Scanner;

/**
 *
 * @author Albani
 */
public class POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Persona p1 = new Persona();

        p1.nombre = "Albani";
        p1.apellido = "Reyes";
        p1.edad = 25;
        
        System.out.println(p1.nombre + " " + p1.apellido + " " + p1.edad);
        
        Persona p2 = new Persona();

        Scanner leer = new Scanner (System.in);
        System.out.print("NOMBRE: ");
        p2.nombre = leer.next();
        System.out.print("APELLIDO: ");
        p2.apellido = leer.next();
        System.out.print("EDAD: ");
        p2.edad = leer.nextInt();
        
        System.out.println(p2.nombre + " " + p2.apellido + " " + p2.edad);
        
        System.out.println(" ");
        
        
        //constructores
        Persona p3 = new Persona("Giovanny", leer.next(), leer.nextInt());
        
        System.out.println(p3.nombre + " " + p3.apellido + " " + p3.edad);
        
        //setter
        Persona p4 = new Persona("Olivia", "Medina",2);
        
        System.out.println(" ");
        System.out.println(p4.nombre + " " + p4.apellido + " " + p4.edad);
        
        p4.setNombre("Olivia Isabel");
        
        System.out.println(p4.nombre + " " + p4.apellido + " " + p4.edad);
        
        // getter
        System.out.println(p4.getNombre());
        System.out.println(p4);
    }

}
