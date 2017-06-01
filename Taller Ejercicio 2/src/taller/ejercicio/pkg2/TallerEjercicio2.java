/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller.ejercicio.pkg2;

import java.util.Scanner;

/**
 *
 * @author baesparza
 */
public class TallerEjercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        
        // Variables
        int n, menor = 0;
        int[] numeros;
        
        //Ingresos de datos
        System.out.print("Ingrese en numero de elementos a ingresar: ");
        n = input.nextInt();
        numeros = new int[n];
        
        for (int i = 0; i < n; i++) {
            
            System.out.print("Ingrese un numero: ");
            numeros[i] = input.nextInt();
            
        }
        
        // Procesos
        for (int i = 0; i < numeros.length; i++) {
            
            if (i == 0) {
                menor = numeros[0];
            } else if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }
        
        // Salida de datos
        System.out.println("EL menor es: "+ menor);
    }
    
}
