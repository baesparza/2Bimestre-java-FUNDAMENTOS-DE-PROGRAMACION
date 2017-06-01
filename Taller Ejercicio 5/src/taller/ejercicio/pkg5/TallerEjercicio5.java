/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller.ejercicio.pkg5;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author baesparza
 */
public class TallerEjercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        
        // Variables
        int n, op;
        int[] lista1, lista2, resultado;
        Boolean reintentar = true;
        String res;
        
        //Ingresos de datos
        System.out.print("Ingrese el numero de elementos a ingresar: ");
        n = input.nextInt();
        lista1 = new int[n];
        lista2 = new int[n];
        resultado = new int[n];
        
        for (int i = 0; i < n; i++) {
            
            System.out.print("Ingrese el numero en la pocicion "+(i + 1)+" de la lista 1: ");
            lista1[i] = input.nextInt();
            
        }
        
        for (int i = 0; i < n; i++) {
            
            System.out.print("Ingrese el numero en la pocicion "+(i + 1)+" de la lista 2: ");
            lista2[i] = input.nextInt();
            
        }
        
        do {

            System.out.print("Ingrese el numero de la opcion que quiere realizar.\n1)Sumar Listas\n2)Restar Listas\n3)Multiplicar Listas\n4)Dividir Listas\n");
            op = input.nextInt();

            switch(op){
                case (1):
                    for (int i = 0; i < resultado.length; i++) {
                        resultado[i]=lista1[i]+lista2[i];
                    }
                    break;
                case (2):
                    for (int i = 0; i < resultado.length; i++) {
                        resultado[i]=lista1[i]-lista2[i];
                    }
                    break;
                case (3):
                    for (int i = 0; i < resultado.length; i++) {
                        resultado[i]=lista1[i]*lista2[i];
                    }
                    break;
                case (4):
                    for (int i = 0; i < resultado.length; i++) {
                        resultado[i]=lista1[i]/lista2[i];
                    }
                    break;
                default :
                    System.out.println("Ingrese una opcion valida.");
                    reintentar = false;
            }

            // Salida de datos
            if ( reintentar ) {
                System.out.println(Arrays.toString(lista1));
                System.out.println(Arrays.toString(lista2));
                System.out.println(Arrays.toString(resultado));
            }
            
            System.out.print("Quiere volver a intentar?\n<SI-NO> ");
                res = input.next();
                System.out.println();
                if (!"SI".equals(res)){
                    reintentar = false;
                }                    
        } while(reintentar);
        
        
        
        
    }
    
}
