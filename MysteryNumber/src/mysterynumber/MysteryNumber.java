/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mysterynumber;

import java.util.Scanner;

/**
 *
 * @author PolinaYoga
 */
public class MysteryNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int input; //To hold the user's input
//Create a Scanner object for keyboard input
Scanner keyboard = new Scanner(System.in);
//Prompt the user to enter a guess
System.out.print("Enter a guess whole number between 1 and 10: ");
input = keyboard.nextInt(); //read the input, store to input
System.out.println("Your guess is too big. Better luck next time.");
if (input > 10){
}
System.out.println("Your guess is to small. Better luck next time.");
if (input < 1) {
}
//Determine whetyher the user entered the mystery number.
System.out.println("Congratulations! You know the mystery number!");
if (input == 9){
}
else{
System.out.println("Sorry, that is NOT the mystery number!");
}
    }
    }

