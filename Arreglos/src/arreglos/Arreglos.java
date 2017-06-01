/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos;

import java.util.Scanner;

/**
 *
 * @author baesparza
 */
public class Arreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        
        // Declaracion del arreglo
        int[] lista;
        int n;
        
        System.out.print("Ingrese el numero de datos a ingresar: ");
        n = input.nextInt();
        
        
        lista = new int[n];
        
        for (int i = 0; i < lista.length; i++) {
            System.out.print("Ingrese un valor: ");
            lista[i] = input.nextInt();
        }
        // Salida de datos
        for (int i = lista.length - 1; i >= 0; i--) {
            System.out.println("Lista ["+(i + 1)+"] = "+lista[i]);
        }
    }
    
}
