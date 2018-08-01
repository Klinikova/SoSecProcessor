package convert;

import java.util.Scanner;

/**
 *
 * @author PolinaYoga
 */
public class Convert {

    public static void main(String[] args) {
        char b;
        char i;
        char g;
        char l;
        char t;
        char e;  
        int c = 99;
        
        //converts the integer to a string and stores it in the
        String str = Integer.toString(c);
        
        //String.valueOf(number);
        //Integer.toString(99);
        

        System.out.print(Character.toUpperCase ('b'));
        System.out.print(Character.toUpperCase('i'));
        System.out.println(Character.toUpperCase('g'));
        
        System.out.print(Character.toLowerCase ('l'));
        System.out.print(Character.toLowerCase ('i'));
        System.out.print(Character.toLowerCase ('t'));
        System.out.print(Character.toLowerCase ('t'));
        System.out.print(Character.toLowerCase ('l'));
        System.out.println(Character.toLowerCase ('e'));
        
        System.out.println(Character.toUpperCase(Character.toLowerCase('A')));
        
        
        System.out.println("Do you want to repeat the program or quit? (R/Q)");
    }
    
}
