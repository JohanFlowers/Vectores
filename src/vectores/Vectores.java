/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vectores;

import javax.swing.JOptionPane;

/**
 *
 * @author Laboratorio2
 */
public class Vectores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[] nombres = new String[4];
        double[] notas = new double[4];
        double prom = 0;
        double may = 0;
        double ind = 0;
        
        for(int i=0; i<=3; i++){
           nombres[i] = 
           JOptionPane.showInputDialog("Ingrese el " + (i+1) + "° Nombre"); 
           notas[i] = Integer.parseInt(JOptionPane.showInputDialog
           ("Ingrese la nota " + (i+1)));
           prom += notas [i];
           if(notas[i]>may){
               may = notas[i];
               ind = i;
           }
         }
    
            prom = prom / 4;
            
            JOptionPane.showMessageDialog(null, "promedio =" + prom);
            JOptionPane.showMessageDialog(null, "Nerd: " + nombres);
    }
}
