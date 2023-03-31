/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios.extras.poo;

/**
 *
 * @author Albani
 */
public class Cuenta {

    private double saldo;
    private String titular;

    public Cuenta(double saldo, String titular) {
        this.saldo = saldo;
        this.titular = titular;
    }

    public void retirar_dinero(double extraccion) {

        if (extraccion > 0 && saldo >= extraccion) {

            this.saldo -= extraccion;

        } else {
            System.out.println("No se puede retirar el dinero");

        }

    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

}
