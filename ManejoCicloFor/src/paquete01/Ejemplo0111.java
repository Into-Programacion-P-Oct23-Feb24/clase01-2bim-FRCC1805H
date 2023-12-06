/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
para iterar de mejor manera agregamos un printf y un acumulador para tener un mejor codigo 
 */
package paquete01;

/**
 *
 * @author reroes
 */
public class Ejemplo0111 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    String  cadenafinal = "";
        for (int i = 1; i <= 10; i++) {
            
            cadenafinal = String.format("%s%d",
                    cadenafinal , i );
        }
        
        for (int i = 1; i < 11; i++) {
            cadenafinal = String.format("%s%d",
                    cadenafinal , i );
            
        }
       System.out.printf("%s",cadenafinal); 
    }

}
