package loops;

import java.util.Scanner;
 
public class Class2 {

public static void main(String[] args) {
//set up a Scanner object  
Scanner input = new Scanner(System.in);

int number = 0;
while (true) {
        
System.out.println("Enter a number between 1 and 100");
number--;
number = input.nextInt();

if (number >= 1 && number <= 100) {
break;
            }
       }
   }
}