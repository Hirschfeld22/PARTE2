/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pasoporreferencia;

/**
 *
 * @author Francisco
 */
public class PasoPorReferencia {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Coche miPuerta = new Coche();
        miPuerta.agregarPuerta();
        System.out.println(miPuerta.puerta);
    }
    
}

    class Coche {
        public int puerta = 0;
        
        
        public void agregarPuerta(){
            this.puerta++;
        }
    }

