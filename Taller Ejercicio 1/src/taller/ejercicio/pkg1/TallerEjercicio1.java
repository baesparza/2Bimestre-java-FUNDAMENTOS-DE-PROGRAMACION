/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller.ejercicio.pkg1;

import java.util.Scanner;

/**
 *
 * @author baesparza
 */
public class TallerEjercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        
        // Variables
        int n, suma = 0, mayor = 0;
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
                mayor = numeros[0];
            } else if (numeros[i]> mayor) {
                mayor = numeros[i];
            }
           suma += numeros[i];
        }
        
        // Salida de datos
        System.out.println("EL mayor es: "+ mayor);
        System.out.println("EL promedio es: "+ suma/2);
        System.out.println("La suma es: "+ suma);
    }
    
}