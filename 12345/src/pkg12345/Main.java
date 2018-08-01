/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg12345;

/**
 *
 * @author PolinaYoga
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String input = "99#7";
        int number;
        try
        {
            number = 0;
        }
        catch(NumberFormatException ex)
        {
            number = 1;
        }
        catch(Exception ex)
        {
            number = -1;
        }
        System.out.println(number);
    }
    
}
