/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package splitmethod;

/**
 *
 * @author PolinaYoga
 */
public class SplitMethod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create a string to tokenize.
        String str1 = "apples pears bananas";
        String str2 = " April, Ben, Cyntia, David ";
        String str3 = "dog$cat@bird%squirrel";
        
        str1 = str1.trim();
                
        String[] tokens1 = str1.split(" ");
        
        // Display the tokens.
        for (String s : tokens1)
        {
            System.out.println(" " + s + " ");
        }
        
        for (String s : tokens1)
        {
            System.out.println("*" + s + "*");
        }
        
        String[] tokens2 = str2.split(",");
        for (String s : tokens2)
        {
            System.out.println(" " + s + " ");
        }
        
        // Get the tokens, using $,@ and % as delimiters.
        String[] tokens3 = str3.split("[$@%]");
        for (String s : tokens3)
        {
            System.out.println(s);
        }
        
    }
    
}
