package rolldice;

import static java.lang.Double.sum;
import java.util.Random;
import java.util.Scanner;


public class RollDice {

    public static void main(String[] args) {
    
    String again = "y";   
    int die1;
    int die2;
    
        Scanner keyboard = new Scanner(System.in);
    
        Random rnd = new Random();
    
 while (again.equalsIgnoreCase("y"))
 {   

System.out.println("Rolling the dice ... ");
    die1 = rnd.nextInt(6) + 1;
    die2 = rnd.nextInt(6) + 1;
System.out.println("Their values are:");
System.out.println(die1 + " " + die2);
System.out.println("Do you want to roll the dice (y = yes)? ");
again = keyboard.nextLine();

    }
}
}