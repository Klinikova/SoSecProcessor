package loops2;

import java.util.Scanner;
 
public class Class1 {

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
 