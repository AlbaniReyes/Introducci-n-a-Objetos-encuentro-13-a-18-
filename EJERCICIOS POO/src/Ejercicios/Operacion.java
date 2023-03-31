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
public class Operacion {
    private int num1;
    private int num2;

    public Operacion(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public Operacion() {
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }
    
    public int crearOperacion() {
        Scanner leer = new Scanner(System.in);
        System.out.print("INGRESE EL PRIMER VALOR (NUMEROS ENTEROS): ");
        this.num1 = leer.nextInt();
        System.out.print("INGRESE EL SEGUNDO VALOR (NUMEROS ENTEROS): ");
        this.num2 = leer.nextInt();
        return this.num1 & this.num2;
    }
    
    
    public int sumar() {
        int suma=num1+num2;
        return suma;
    }
    
    public int restar() {
        int resta=num1-num2;
        return resta;
    }
    
    public int multiplicar() {
        int multi=num1*num2;
        return multi;
    }
    
    public double dividir() {
        double divi=num1/num2;
        return divi;
    }
}
