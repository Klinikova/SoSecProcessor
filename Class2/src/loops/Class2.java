package loops;
 
 import java.util.Scanner;
 
 public class Class2 {
 
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        int number = 0;
         while (true) {
             System.out.println("Enter a number between 1 and 100");
             number = input.nextInt();
             if (number >= 0 && number <= 100) {
                 break;
             }
         }
         
    }
 }

