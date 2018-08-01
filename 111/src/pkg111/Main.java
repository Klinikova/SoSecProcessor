/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package returnInArray;

/**
 *
 * @author PolinaYoga
 */
public class Main {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        // roll 5 dice
        int[] results = rollDice(5);
        for (int value : results){
            System.out.println(value);
        }
        int total = findSum(results);
        System.out.println();
        
    public static int[] rollDice(int n){
        // make a newint array of size n
        int array[] = new int[n];
        // creeate a random object
        Random rand = new Random();
        // fill the array with random dice faces (1-6)
        for(int i = 0; i < n; i++){
            array[i] = rand.nextInt(6) + 1; // dice face are 1-6
        }
        // return the array object
        return array;
    }
}
