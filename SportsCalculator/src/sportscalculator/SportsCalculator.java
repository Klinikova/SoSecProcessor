/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sportscalculator;

import static java.lang.Double.max;

/**
 *
 * @author PolinaYoga
 */
public class SportsCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Get winning procentage for rockets
        Team rockets = new Team();
        double result1 = rockets.getWinningProcentage(49, 13);
        
        // Get winning procentage for rockets
        Team warriors = new Team();
        double result2 = warriors.getWinningProcentage(49, 14);
        
        // Print the result
        System.out.printf("The winning procentage for the Rockets is %.2f \n", result1);
        System.out.printf("The winning procentage for the Warriors is %.2f \n", result2);
        
        if (max(result1, result2) == result1){
            System.out.printf("The Rockets have the highter winning procentage: %.2f \n", result1);     
        }
        else if(max(result1, result2) == result2){ 
            System.out.printf("The Warrios have the highter winning procentage: %.2f \n", result2);     
        }
        
        else {
            System.out.printf("Both team have the same winning procentage: %.2f \n", result1);
        }
    } 
    
    public static double max(double a, double b){
        double result = a;
        if (a > b){
            result = a;
        }
        else if (a == b){
            result = -1.0;
        }
        else {
            result = b;
        }
        return result;
}
}