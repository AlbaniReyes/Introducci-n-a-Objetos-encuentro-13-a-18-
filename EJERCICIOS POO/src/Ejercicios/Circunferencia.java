/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author Albani
 */
public class Circunferencia {

    private double Radio;

    public Circunferencia(double Radio) {
        this.Radio = Radio;
    }
    
    public void setRadio(double Radio) {
        this.Radio = Radio;
    }

    public double getRadio() {
        return Radio;
    }

    public double crearCircunferencia() {
        Scanner leer = new Scanner(System.in);
        System.out.print("INGRESE EL RADIO: ");
        this.Radio = leer.nextDouble();
        return this.Radio;
    }
    
    public double area() {
        double area = Math.PI * Math.pow(Radio, 2);
        return area;
    } 
    
    public double perimetro() {
        double perimetro = 2* Math.PI * Radio;
        return perimetro;
    } 
 
    
}



