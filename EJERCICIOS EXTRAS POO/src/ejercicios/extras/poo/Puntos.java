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
public class Puntos {
    private int x1;
    private int x2;
    private int y1;
    private int y2;

    public Puntos() {
    }
    
    public Puntos(int x1, int x2, int y1, int y2) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }

    public int getX1() {
        return x1;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public int getX2() {
        return x2;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public int getY1() {
        return y1;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    public int getY2() {
        return y2;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }
    
    public void crearPuntos(){
        Scanner leer = new Scanner (System.in);
        System.out.println("INGRESE EL VALOR DE X1: ");
        this.x1 = leer.nextInt();
        System.out.println("INGRESE EL VALOR DE Y1: ");
        this.y1 = leer.nextInt();
        System.out.println("INGRESE EL VALOR DE X2: ");
        this.x2 = leer.nextInt();
        System.out.println("INGRESE EL VALOR DE Y2: ");
        this.y2 = leer.nextInt();
    }
    
    public double distanciaEntrePuntos(){
        double distancia = Math.sqrt(((this.x2 - this.x1) * (this.x2 - this.x1)) + ((this.y2 - this.y1) * (this.y2 - this.y1)));
        return distancia;
    }
        
    }
