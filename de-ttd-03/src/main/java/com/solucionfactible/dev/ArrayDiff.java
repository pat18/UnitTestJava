package com.solucionfactible.dev;

/**
 * diff subtracts one list from another and returns the result.
 * It should remove all values from list a, which are present in list b keeping their order.
 * 
 * @author developer
 */
public class ArrayDiff {
	
	public static int[] diff(int[] a, int[] b) {
            // Cuántos valores de a no están en b
            int count = 0;
            for (int valorA : a) {
                boolean encontrado = false;
                for (int valorB : b) {
                    if (valorA == valorB) {
                        encontrado = true;
                        break;
                    }
                }
                if (!encontrado) {
                    count++;
                }
            }

            // nuevo arreglo para valores de a que no están en b
            int[] resultado = new int[count];
            int indice = 0;
            for (int valorA : a) {
                boolean encontrado = false;
                for (int valorB : b) {
                    if (valorA == valorB) {
                        encontrado = true;
                        break;
                    }
                }
                if (!encontrado) {
                    resultado[indice] = valorA;
                    indice++;
                }
            }

            return resultado;
	}

}
