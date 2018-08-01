import java.util.Scanner;

public class SecretWord {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Enter the secret word: ");
        String input = keyboard.nextLine();
        
        if (input.equalsIgnoreCase ("PROSPERO")){
            System.out.println("Congratulations! You know the secret word! ");    
        }
        else {
             System.out.println("Sorry! That is NOT the secret word! ");    
        }
    }
    
}
