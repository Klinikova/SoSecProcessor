package javaapplication6;

import javax.swing.*;

public class PayrollDialog{
      public static void main(String[] args){
        int hours;
        double payRate;
        String inputString;
        inputString = JOptionPane.showInputDialog("How many hours did you work? ");
        hours = Integer.parseInt(inputString);
           inputString = JOptionPane.showInputDialog("What is your hourly pay rate?" );
           payRate = Double.parseDouble(inputString);
           
           //Calculate the gross pay
           double grossPay = hours * payRate;
    
           //Display the results
           JOptionPane.showMessageDialog(null, "Your gross pay is $" + grossPay);
           //End the program. Needed when using GUIs.
           System.exit(0);

           {
               
           }         
