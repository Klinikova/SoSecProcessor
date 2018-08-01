  /*
  * To change this license header, choose License Headers in Project Properties.
  * To change this template file, choose Tools | Templates
  * and open the template in the editor.
  */
package loops2;

import java.util.Scanner;
 
 /**
  *
  * @author alexj
*/
public class Class1 {
 
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //set up a Scanner object  
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 100");
        int number = input.nextInt();
        while (number > 100 || number < 0) {
            System.out.println("Invalid input");
            System.out.println("Enter a number between 1 and 100");
            number = input.nextInt();
        }
 
         System.out.println("You entered " + number);
    }
}