/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cambiomoneda;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Principal {
    public static void main (String []args){
        CambioMonedaMatriz cb=  new CambioMonedaMatriz();
        cb.show();
        int n[]={0,2,3,4,6};
        int cantidad=6;
        int moneda=n.length-1;
        CambioMoneda cam = new CambioMoneda();
        cam.calcularMonedas(cantidad, moneda, n);
        String sub [][] =cam.sub();
        
        
        
        for (int i = 0; i <moneda+1; i++) {
            for (int j = 0; j <cantidad+1; j++) {
                System.out.print("["+sub [i][j]+"]"); 
            }
             System.out.println("      "); 
        }
    }
    
    
}
