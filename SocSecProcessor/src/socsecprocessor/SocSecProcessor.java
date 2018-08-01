/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package socsecprocessor;

import java.util.Scanner;



/**
 *
 * @author PolinaYoga
 */
public class SocSecProcessor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean shouldContinue = true;
        
        while(shouldContinue){
            
           Scanner input = new Scanner(System.in);
            System.out.println("Enter your name: ");
            String name = input.nextLine();
            System.out.println("Enter your SSN: (XXX-XX-XXX)");
            String SSN = input.nextLine();

            try
            {
                isValid(SSN);
                System.out.println(name);
                System.out.println(SSN);


            }
            catch(SocSecException e)
            {
                System.out.println(name);
                System.out.println(SSN);
                System.out.println(e.error);
            }
            System.out.println("Do you want to try again? Y/N");
            
            String answer = input.nextLine();
            
            shouldContinue = answer.toUpperCase().equals("Y");
        }
        
        
    }
    
    public static boolean isValid(String ssn) throws SocSecException
    {
        //boolean valid = false;
        char[] ssnToChar = ssn.toCharArray();
        if (ssnToChar.length != 10){
            throw new SocSecException("SSN is not 11 characters in length.");
        }
        for(int i = 0; i <= ssnToChar.length; i++){
           if(i < 3){
               if(!Character.isDigit(ssn.charAt(i))){
                    throw new SocSecException("SSN does not containt appropriate numbers.");
               }
           }
           else if(i == 3){
                if (!(ssn.charAt(i) == '-')){
                    throw new SocSecException("SSN does not containt appropriate dashes.");
                }
           }
           else if(i > 3 && i < 6){
               if(!Character.isDigit(ssn.charAt(i))){
                    throw new SocSecException("SSN does not containt appropriate numbers.");
               }
           }
           else if(i == 6){
                if (!(ssn.charAt(i) == '-')){
                    throw new SocSecException("SSN does not containt appropriate dashes.");
                }
           }
           else if(i > 6 && i < 10){
               if(!Character.isDigit(ssn.charAt(i))){
                    throw new SocSecException("SSN does not containt appropriate numbers.");
               }
           }           
        }
        return true;
    }
}