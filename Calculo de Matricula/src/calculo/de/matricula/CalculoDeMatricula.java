/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculo.de.matricula;

import java.util.Scanner;

/**
 *
 * @author baesparza jahurtadod
 */
public class CalculoDeMatricula {

    /**
     * @param args the command line arguments
     */
    
    public static double v_credito = 0; 
    public static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) {
        // TODO code application logic here
        float total = (float) descuentoBecas((int) (ciclo()+valorCreditos()));
        System.out.print("El valor a pagar es: "+total);
    }
    
    public static float ciclo() {
        System.out.print("Ingrese el ciclo academico: ");
        int ciclo = input.nextInt();
        float matricula = 700 + ((ciclo - 1) * 10);
        return matricula;
    }
    
    public static float valorCreditos() {
        System.out.print("Ingrese el numero de materias troncales: ");
        int troncales = input.nextInt();
        System.out.print("Ingrese el numero de materias basicas: ");
        int basicas = input.nextInt();
        float resultado = 0;
        resultado = ((troncales * 4 * 35)+(basicas * 3 * 35 ));
        return resultado;
    }
    
    public static double descuentoBecas (int resultado){
        Scanner input = new Scanner(System.in);
        double descuento = 0, total = 0;
        System.out.println("Seleccione su tipo de beca: ");
        System.out.println(" 1-Por meritos academicos\n 2-Beca Familiar\n 5-No tiene beca");
        int op = input.nextInt();
        switch (op){
            case (1): 
                descuento = 0.15; 
                break;
            case (2): 
                descuento = 0.08; 
                break;
            default:
                descuento = 0;
                break;            
        }
        total = (resultado-(resultado*descuento)) * 1.14;       
        return total;
    }
}
