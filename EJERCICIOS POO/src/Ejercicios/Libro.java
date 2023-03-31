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
public class Libro {
    private int ISBN;
    private String Titulo;
    private String Autor;
    private int nPaginas;

    public Libro() {
    }

    public Libro(int ISBN, String Titulo, String Autor, int nPaginas) {
        this.ISBN = ISBN;
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.nPaginas = nPaginas;
    }

    public void cargarLibro() {
        Scanner leer = new Scanner(System.in);
        System.out.print("INGRESE EL ISBN DEL LIBRO: ");
        this.ISBN = leer.nextInt();
        System.out.print("INGRESE EL TÍTULO DEL LIBRO: ");
        this.Titulo = leer.next();
        System.out.print("INGRESE EL AUTOR DEL LIBRO: ");
        this.Autor = leer.next();
        System.out.print("INGRESE EL NRO DE PÁGINAS DEL LIBRO: ");
        this.nPaginas= leer.nextInt();
    }

    
    
    @Override
    public String toString() {
        return "Libro{" + "ISBN=" + ISBN + ", Titulo=" + Titulo + ", Autor=" + Autor + ", nPaginas=" + nPaginas + '}';
    }
    
    
    
}


    
    
   

