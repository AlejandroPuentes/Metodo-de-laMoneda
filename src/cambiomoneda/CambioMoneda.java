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
public class CambioMoneda {

    /**
     * @param args the command line arguments
     */
    int conta=0;
    int  infinito=99 ;
    private int[][] matrizCambio;
    private int[] vectorMonedas;
    private int cantidad;
    private int[] vectorSeleccion;
    private String[][] subindix; 

   

    

    public int[][] calcularMonedas(int cantidad,int moneda,int moned[]){
        
          int monedas[]=ContaBur(moned);
        
        matrizCambio=new int [moneda+1][cantidad+1];
        subindix =  new String [moneda+1][cantidad+1];
        

        for (int i = 0; i <=moneda; i++){
            matrizCambio[i][0] = 0;
            
        }
        for (int i = 0; i <=moneda; i++){
            subindix[i][0]="0";
        }
        
        for (int j = 1; j <=cantidad; j++){
            matrizCambio[0][j] = 99;
            
        }
        for (int j = 0; j <=cantidad; j++){
            subindix[0][j]="∞";
        }
        
        for (int i = 1; i <=moneda; i++){
            for (int j = 1; j <=cantidad; j++) {
                if (i==1 && (j)<monedas[i]){
                    matrizCambio[i][j]=infinito;
                    subindix[i][j]="∞";
                }else{
                    if (i==1){
                        subindix[i][j]=("["+(1+matrizCambio[1][j-monedas[i]])+" ]"+" "+(monedas[i])+"");
                        matrizCambio[i][j]= 1+matrizCambio[1][j-monedas[i]];
                    }
                }                
                if(j<monedas[i]){
                    subindix[i][j]=("["+(matrizCambio [i-1][j])+"]"+" "+(monedas[i-1])+"");
                    matrizCambio[i][j]= matrizCambio [i-1][j];
                }else{
                    matrizCambio[i][j]=min(matrizCambio[i-1][j],1+matrizCambio[i][j-monedas[i]]);   
                    if (matrizCambio[i-1][j]>1+matrizCambio[i][j-monedas[i]]){
                       subindix[i][j]=("["+(matrizCambio[i-1][j])+"]"+" "+((monedas[i-1]))+" "); 
                    }else{
                        subindix[i][j]=("["+(1+matrizCambio[i][j-monedas[i]])+"]"+" "+((monedas[i])));
                    }
                }  
            }
        }
        return matrizCambio;
    }

    private int min(int a, int b){
        if(a<b)
            return a;

        else
            return b;
    }
    public int[] ContaBur(int a[]){
        conta=0;
        int i,j;
        int N=a.length;
        int temp;
        //metodo de ordenamiendo burbuja
        conta=conta+4;
        for(i=0;i<N-1 ; i++) {
            conta=conta+6;
            for(j=i+1; j < N; j++) {
                conta=conta+5;
                if(a[i] > a[j]) {
                    conta=conta+7;
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }         
        return a;
    }
   public String[][] sub(){
       return subindix;
   }
    
}

