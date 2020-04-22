/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paquetaso;

/**
 *
 * @author josel
 */
public class Pato {

    // Se añaden los atributos de la clase
    private int patas;
    private boolean volar;

    // Constructor sin parámetros
    public Pato() {
        this.patas = 2;
        this.volar = true;
    }

    // Constructor con parámetros
    public Pato(int patas, boolean volar) {
        this.patas = patas;
        this.volar = volar;
    }

    // Se añaden los getters y setters
    public int getPatas() {
        return patas;
    }

    public void setPatas(int patas) {
        this.patas = patas;
    }

    public boolean isVolar() {
        return volar;
    }

    public void setVolar(boolean volar) {
        this.volar = volar;
    }

    // toString de la clase
    @Override
    public String toString() {
        return "Pato{" + "patas=" + patas + ", volar=" + volar + '}';
    }

}
