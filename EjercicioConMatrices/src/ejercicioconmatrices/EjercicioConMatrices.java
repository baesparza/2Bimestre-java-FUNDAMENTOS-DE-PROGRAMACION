package ejercicioconmatrices;

import java.util.Scanner;

/**
 * @author baesparza
 */
public class EjercicioConMatrices {
    
    private int[][] numeros;
    Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        // TODO code application logic here
        int opc;
        boolean repetir = true;
        String repetirtxt = "";
        EjercicioConMatrices ma = new EjercicioConMatrices();
        
        ma.leerMatriz();
        do {
            System.out.print("Ingrese que opcion desea.\n1 Martiz Principal\n2 Martiz Secundaria\n3 Martiz Principal Superiorn\n4 Martiz Principal Inferior\n5 Martiz Secundaria Superior\n6 Martiz Secundaria Inferior\n7 Matriz en Zig Zag ");
            opc = ma.input.nextInt();

            switch(opc) {
                case(1):
                    ma.matrizPrincipal();
                    break;
                case(2):
                    ma.matrizSecundaria();
                    break;
                case(3):
                    ma.superiorPrincipal();
                    break;
                case(4):
                    ma.inferiororPrincipal();
                    break;
                case(5):
                    ma.superiorSecundaria();
                    break;
                case(6):
                    ma.inferiorSecundaria();
                    break;
                case(7):
                    ma.zigzag();
                    break;
            }
            System.out.print("Quiere volver a intntar? \n<SI - NO> ");
            repetirtxt = ma.input.next();
            if (repetirtxt == "SI"){
                repetir = true;
            } else {
                repetir = false;
            }
        } while(repetir);
        
    }
    
    public int[][] leerMatriz() {
        
        int n;
        
        System.out.print("Ingrese el tamaño de la matriz: ");
        n = input.nextInt();
        
       
        
        numeros = new int[n][n];
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                
                System.out.print("Ingrese un valor: ");
                numeros[i][j] = input.nextInt();
                
            }
            
        }
        return numeros;
    }
   
    public void matrizSecundaria() {
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros.length; j++) {
                
                if (i + j == numeros.length - 1) {
                   System.out.print(numeros[i][j]);
                } else {
                   System.out.print(" ");
                }
                System.out.print(" ");
                                
            }
            System.out.println();
        }
    }
    
    public void matrizPrincipal() {
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros.length; j++) {
                
                if (i == j) {
                   System.out.print(numeros[i][j]);
                } else {
                   System.out.print(" ");
                }
                System.out.print(" ");
                                
            }
            System.out.println();
        }
    }
    
    public void superiorPrincipal() {
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros.length; j++) {
                
                if (i < j) {
                   System.out.print(numeros[i][j]);
                } else {
                   System.out.print(" ");
                }
                System.out.print(" ");
                                
            }
            System.out.println();
        }
    }
    
    public void inferiororPrincipal() {
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros.length; j++) {
                
                if (i > j) {
                   System.out.print(numeros[i][j]);
                } else {
                   System.out.print(" ");
                }
                System.out.print(" ");
                                
            }
            System.out.println();
        }
    }
    
    public void superiorSecundaria() {
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros.length; j++) {
                
                if (i + j < numeros.length - 1) {
                   System.out.print(numeros[i][j]);
                } else {
                   System.out.print(" ");
                }
                System.out.print(" ");
                                
            }
            System.out.println();
        }
    }
    
    public void inferiorSecundaria() {
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros.length; j++) {
                
                if (i + j >= numeros.length) {
                   System.out.print(numeros[i][j]);
                } else {
                   System.out.print(" ");
                }
                System.out.print(" ");
                                
            }
            System.out.println();
        }
    }
    
    public void zigzag() {
        Boolean sube = true;
        int j = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (sube) {
                for (j = 0; j < numeros.length; j++) {
                    System.out.print(numeros[j][i]);
                    System.out.print(" ");
                }
                sube = !sube;
            } else if (!sube) {
                for (j = numeros.length - 1; j >= 0; j--) {
                    System.out.print(numeros[j][i]);
                    System.out.print(" ");
                }
                sube = !sube;
            }
        }
        System.out.println();
    }
    
}
