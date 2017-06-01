/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package separar.arreglos;

import java.util.Scanner;

/**
 *
 * @author baesparza
 */
public class SepararArreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        
        // Declaracion del arreglos
        int[] lista1, lista2, lista3;
        int n, temp, j = 0, k = 0,i = 0,jsum = 0, ksum = 0, isum=0;
        // Creacion de listas
        System.out.print("Ingrese el numero de datos a ingresar: ");
        n = input.nextInt();
        temp = n - (int)(n/2)+1;
        lista1 = new int[n+1];
        if (n %2 == 0) {
           lista2 = new int[(int)(n/2)+1]; 
        } else {
            lista2 = new int[(int)(n/2)+2];
        }
        lista3 = new int[temp];
        
        for (i = 0; i < lista1.length-1; i++) {
            System.out.print("Ingrese un valor: ");
            lista1[i] = input.nextInt();
            if (i % 2 == 0) {
                lista2[j] = lista1[i];
                jsum += lista2[j];
                j++;
            } else {
                lista3[k] = lista1[i];                
                ksum += lista3[k];
                k++;
            }
            isum += lista1[i];
            
        }
        
        lista1[i] = isum;
        lista2[j] = jsum;
        lista3[k] = ksum;
        
        // Salida de datos
        
        for (int _i = 0; _i < lista1.length; _i++) {
            System.out.println("Lista1 ["+(_i + 1)+"] = "+lista1[_i]);
        }
        for (int _j = 0; _j < lista2.length; _j++) {
            System.out.println("Lista2 ["+(_j + 1)+"] = "+lista2[_j]);
        }
        for (int _k = 0; _k < lista3.length; _k++) {
            System.out.println("Lista3 ["+(_k + 1)+"] = "+lista3[_k]);
        }
    }
    
}