/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mileage;

import javax.swing.JOptionPane;


// This program will calculate mileage per gallon, Polina Klinikova, 2/15/18
public class Mileage {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 1. Print a line indicating this program will calculate mileage per gallon
        System.out.println( "This program will calculate mileage per gallon");
        /** 
        2. Print prompt to user asking for miles driven
        3. Read in miles driven 
        */ 
        double driven = Integer.parseInt(JOptionPane.showInputDialog("Enter miles driven:")); // represents miles driven by user
        // 4. Print prompt to user asking for gallons used
        // 5. Read in gallons used 
        double gallons = Integer.parseInt(JOptionPane.showInputDialog("Enter gallons used:")); // represents gallons used by user
        // 6. Calculate miles per gallon by dividing miles driven by gallons used
        double mpg = driven/gallons; // represents the calcualtion of miles per gallon
        // 7. Print miles per gallon along with appropriate labels
        System.out.println("Your miles per gallon is " + mpg);
        
        // 8. Run the program and test it using the following sets of data and record the results:
        // Data Set
        double driven1 = 2000;
        double gallons1 = 100;
        double mpg1 = driven1/gallons1;
        
        double driven2 = 500;
        double gallons2 = 25.5;
        double mpg2 = driven2/gallons2;
        
        double driven3 = 241.5;
        double gallons3 = 10;
        double mpg3 = driven3/gallons3;
        
        double driven4 = 100;
        double gallons4 = 0;
        double mpg4 = driven4/gallons4;
        
        System.out.println("Data set 1: " + mpg1);
        System.out.println("Data set 2: " + mpg2);
        System.out.println("Data set 3: " + mpg3);
        System.out.println("Data set 4: " + mpg4);
        
    }
    
}
