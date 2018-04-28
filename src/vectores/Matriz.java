/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vectores;

/**
 *
 * @author Laboratorio2
 */
public class Matriz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[][] matriz = new int [3][3];
        
        for(int f=0; f<=2; f++){
            for( int c=0; c<=2; c++){
                if(f==c || f+c == 2){
                    matriz[f][c] = 1;
                }else{
                     matriz[f][c] = 0;
                }
            }
        }
        for(int f=0; f<=2; f++){
           System.out.println("\n");
            for( int c=0; c<=2; c++){
             System.out.print(matriz[f][c]+"");  
                }
        }
        
    }
    
}
