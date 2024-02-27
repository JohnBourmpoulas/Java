/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calc2;

/**
 *
 * @author John Bourmpoulas
 */

import javax.swing.JOptionPane;

public class Calc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int number1, number2;
        String str;
        char operator;


            str = JOptionPane.showInputDialog("Enter 1st integer");
            number1 = Integer.parseInt(str);
    
            str = JOptionPane.showInputDialog("Enter 2nd integer");
            number2 = Integer.parseInt(str);

            str = JOptionPane.showInputDialog("Enter operator to use");
            operator = str.charAt(0);

            switch(operator){
                case('-'):
                    JOptionPane.showMessageDialog(null,number1 - number2);
                    break;
                case('+'):
                    JOptionPane.showMessageDialog(null,number1 + number2);
                    break;                
                case('*'):
                    JOptionPane.showMessageDialog(null,number1 * number2);
                    break;
                case('/'):
                    JOptionPane.showMessageDialog(null,number1 / number2);
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"Error: invalid operator!");         
            }      
    }
}
