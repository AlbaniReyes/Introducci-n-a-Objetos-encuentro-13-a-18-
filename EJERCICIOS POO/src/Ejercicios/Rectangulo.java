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
public class Rectangulo {
    private int base;
    private int altura;
    
    public Rectangulo() {
    }

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    
    public void crearRectangulo() {
        Scanner leer = new Scanner(System.in);
        System.out.print("INGRESE EL VALOR DE LA BASE: ");
        this.base = leer.nextInt();
        System.out.print("INGRESE EL VALOR DE LA ALTURA: ");
        this.altura = leer.nextInt();
        }
        
    
    public int superficie(){
        int superficie =base*altura;
        return superficie;
    }
    
    public int perimetro(){
        int perimetro =(base+altura)*2;
        return perimetro;
    }
    
    public boolean dibujar(){
        for (int i = 1 ; i <= altura ; i++){
            for (int j = 1 ; j <= base ; j++){
                if ((i==1)  || (i==altura) || (j==1) || (j==base)){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
        return true;
    }
    
    
}
