
import javax.swing.JOptionPane;

public class DialogProject {

public static void main(String[] args) {
    
    //String firstName = null;
    String firstName = JOptionPane.showInputDialog("What's your first name?");
    String lastName = JOptionPane.showInputDialog("What's your last name?");

    String fullName= firstName + " " + lastName;
    
    System.out.println("What's your full name? " + fullName);
    }
    
}
