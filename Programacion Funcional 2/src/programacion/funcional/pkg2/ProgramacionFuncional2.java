/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacion.funcional.pkg2;

import java.util.Scanner;

/**
 *
 * @author baesparza
 */
public class ProgramacionFuncional2 {
    /**
     * @param args the command line arguments
     */
    
    public static double iva = 0.14;
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // TODO code application logic here
        float resultado = 0, total;
        int opc = 0;
        
        // Ingreso de datos
        System.out.print("Ingrese el valor de la compra: ");
        total = input.nextFloat();
        
        System.out.println("Ingrese el tipo de institucion.\n<1>Publica\n<2>Privada\n<3>Persona Natutal");
        opc = input.nextInt();
        
        switch(opc){
            case (1):
                resultado = descuento(total, (float) 0.06);
                break;
            case (2):
                resultado = descuento(total, (float) 0.02);
                break;
            case (3):
                resultado = descuento(total, (float) 0.08);
                break;
        }
        
        
        System.out.println("El valor a pagar es: "+resultado);

    }
    
    public static float calcularIva(float subtotal) {
        float total = (float) (subtotal * iva);
        return total;
    }
    
    public static float descuento(float subtotal, float descuento) {
        float resultado = subtotal;
        float iva = calcularIva(subtotal);
        resultado = resultado - (resultado * descuento);
        resultado += iva;
        return resultado;
    }
    
}