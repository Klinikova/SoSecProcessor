/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grader;

/**
 *
 * @author PolinaYoga
 */
public class Grader {
    
    public double getLowestScore(){
        int[] x = { 55, 33, 88, 22, 99,
                    11, 44 66, 77};
        
        for(int i = 1; i < testScore.length; i++){
            if (testScore[i] < lowest)
                lowest = testScore[i];
        }
        
        return lowest;
    }      
            
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
