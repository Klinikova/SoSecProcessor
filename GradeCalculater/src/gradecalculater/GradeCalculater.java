package gradecalculater;

import java.util.Scanner;

public class GradeCalculater {

    public static void main(String[] args) {
        int grade;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a numeric grade out of 100: ");
        grade = input.nextInt();
        
        if (grade >= 90){
            System.out.println("Congratulations! You got an A! ");    
        }
        else if (grade >= 80){
            System.out.println("Congratulations! You got a B! ");    
        }
        else if (grade >= 70){
            System.out.println("Congratulations! You got a C! ");    
        }  
        else if (grade >= 60){
            System.out.println("Oh no. You got a D! ");    
        }
        else{
            System.out.println("Sorry! You got an F! ");    
        }
    }
    
}