/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paquetaso;

/**
 *
 * @author San
 */
public class Main {
    public static void main(String[] args) {
        // Creación de 2 objetos Pato
        Pato pato1 = new Pato();
        Pato pato2 = new Pato(2, false);
        
        // Imprimo sus valores por consola
        System.out.println(pato1.toString());
        System.out.println(pato2.toString());
    }
}
