/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacion.funcional.pkg1;

/**
 *
 * @author baesparza
 */
public class ProgramacionFuncional1 {
    /**
     * @param args the command line arguments
     */
    
    public static double iva = 0.14;
    
    public static void main(String[] args) {
        // TODO code application logic here
        mensaje();        
        float resultado = calularIva(25);
        System.out.println(resultado);
    }
    
    public static void mensaje() {
        System.out.println("Mensaje de prueba");
    }
    
    public static float calularIva(float subtotal) {
        float total = (float) (subtotal * iva);
        return total;
    }
    
}
