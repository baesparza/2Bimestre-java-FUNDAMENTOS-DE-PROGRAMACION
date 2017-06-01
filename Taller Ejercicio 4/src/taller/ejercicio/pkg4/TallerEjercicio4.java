/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller.ejercicio.pkg4;

import java.util.Scanner;
/**
 *
 * @author baesparza
 */
public class TallerEjercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        //Variables
        int[] cedula;
        String cedulatemp;
        
        int sumatoria = 0, num = 2, diferencia, numero;
        cedula = new int[10];
        
        //Ingreso de datos
        do {
            System.out.print("Ingrese un numero de cedula valido: ");
            cedulatemp = input.next();
        } while (cedulatemp.length() != 10);
        
        for (int i = 0; i < cedulatemp.length() - 1; i ++) {
            cedula[i] = (int) ((cedulatemp.charAt(i)) - 48);
        }

        //Proceso para comprobar cedula
        for (int i = 0; i < cedulatemp.length() - 1; i ++) {
            numero = ((cedulatemp.charAt(i)) - 48) * num;
            if (numero >= 10)  {
                sumatoria += (Integer.toString(numero).charAt(0) - 48 + Integer.toString(numero).charAt(1) - 48);
            } else {
               sumatoria += numero; 
            }
            
            if (num == 2) {
                num = 1;
            } else {
                num = 2;
            }
            
        }
        
        //Pasamos al maximo superior y restamos
        diferencia = (int)(sumatoria - (sumatoria % 10) + 10);
        
        //Salida de datos
        if ((diferencia - sumatoria) == (cedulatemp.charAt(9)) - 48){
            System.out.println("Es un numero de cedula valido");
        } else {
            System.out.println("No es un numero de cedula valido");
        }
        
    }
    
}
