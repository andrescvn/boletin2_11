/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2_11;

import javax.swing.JOptionPane;

/**
 *
 * @author acomesanavila
 */
public class Boletin2_11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float soldofixo;
        float importe;
        float km;
        float dias;
        float soldoliquido;
        soldofixo=Float.parseFloat(JOptionPane.showInputDialog("soldofixo"));
        km=Float.parseFloat(JOptionPane.showInputDialog("km"));
        dias=Float.parseFloat(JOptionPane.showInputDialog("dias"));
        soldoliquido= soldofixo + (soldofixo*5/100) - (soldofixo*18/100)-36 +2*km *30*dias;
        JOptionPane.showMessageDialog(null, "soldo liquido ="+ soldoliquido);
        
               
    }
    
}
