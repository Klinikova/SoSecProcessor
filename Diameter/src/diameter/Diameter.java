package diameter;

import javax.swing.JOptionPane;

public class Diameter {

    public static void main(String[] args) {
        // 1. declare input from user and 2. assigne to variable 'diameter'
        double diameter = Integer.parseInt(JOptionPane.showInputDialog("What is the diameter of a sphere?"));
        System.out.println("Diameter: " + diameter);
        // 3. calculate and store the radius in a variable
        double radius = diameter/2;
        System.out.println("Radius: " + radius);
        // 4. formula of the volume of a sphere
        // Math.pow(chislo, stepen') = Math.pow(4, 3) = chislo 4 v 3 stepeni
        double volume = 4  * Math.PI * Math.pow(radius, 3) / 3;
        // 5. Print result
        System.out.println("Volume: " + volume);
    }
    
}
