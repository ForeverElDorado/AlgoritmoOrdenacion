/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Codigo;

import java.util.Arrays;

/**
 *
 * @author aghsk
 */
public class AlgoritmosOrdenacion {

    int[] lista1 = {13, 27, 455, 621, 23, 1, 15};

    public void ordenacionBurbuja(int[] numeros) {
        for (int j = 0; j < numeros.length; j++) {
            for (int i = 0; i < numeros.length; i++) {
                if (numeros[i] > numeros[i + 1]) {
                    int aux = numeros[i + 1];
                    numeros[i + 1] = numeros[i];
                    numeros[i] = aux;
                }
            }
        }

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //
        AlgoritmosOrdenacion ordenacion = new AlgoritmosOrdenacion();
        System.out.println("Lista sin ordenar: " + Arrays.toString(ordenacion.lista1));

        ordenacion.ordenacionBurbuja(ordenacion.lista1);

        System.out.println(Arrays.toString(ordenacion.lista1));
        System.out.println("Lista ordenada con burbuja: " + Arrays.toString(ordenacion.lista1));
    }

}
