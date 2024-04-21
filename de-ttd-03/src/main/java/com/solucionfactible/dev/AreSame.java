package com.solucionfactible.dev;

/**
 * comp checks whether the two arrays have the "same" elements, with the same multiplicities. "Same" means, 
 * here, that the elements in b are the elements in a squared, regardless of the order.
 * 
 * @author Saul
 */
public class AreSame {
	
	public static boolean comp(int[] a, int[] b) {
        //validación - solo arreglos con la misma longitud
        if (a.length != b.length) {
            return false;
        }

        // Verificar si los elementos al cuadrado en b están presentes en a
        for (int num : b) {
            boolean encontrado = false;
            for (int i = 0; i < a.length; i++) {
                if (a[i] * a[i] == num) {
                    encontrado = true;
                    break;
                }
            }
            if (!encontrado) {
                return false;
            }
        }

        return true;  
        }

}
