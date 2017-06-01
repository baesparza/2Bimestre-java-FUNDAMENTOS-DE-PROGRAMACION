/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller.ejercicio.pkg3;

import java.util.Scanner;

/**
 *
 * @author baesparza
 */
public class TallerEjercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        // Variables
        int[] lista;
        int cont;
        
        System.out.println("Inserte el número de datos a ingresar: ");
        int n = input.nextInt(); 
        lista = new int[n];
        
        for (int i = 0; i < lista.length; i++ ){
            System.out.println("Ingrese el valor :");
            lista[i] = input.nextInt();
        }

        for (int i = 0; i < lista.length; i++){
            cont = 0;
            for (int j = 0; j < lista.length; j++ ){
                if (lista[i] == lista[j]){
                    cont += 1 ; 
                }
            }
            System.out.println("El numero "+lista[i]+" se repite " +cont+" veces."); 
        }
    } 
}
