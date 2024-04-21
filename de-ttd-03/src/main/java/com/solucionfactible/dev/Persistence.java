package com.solucionfactible.dev;

/**
 * persistence takes in a positive parameter num and returns its multiplicative persistence, which is the number 
 * of times you must multiply the digits in num until you reach a single digit.
 * 
 * @author developer
 */
public class Persistence {
	
	public static int persistence(long num) {
             int persistencia = 0;
        
            while (num >= 10) {
                long producto = 1;

                // número a una cadena
                String numeroStr = Long.toString(num);

                // Multiplicar los dígitos
                for (int i = 0; i < numeroStr.length(); i++) {
                    producto *= Long.parseLong(Character.toString(numeroStr.charAt(i)));
                }

                num = producto;
                persistencia++;
            }

            return persistencia;
           
	}

}
