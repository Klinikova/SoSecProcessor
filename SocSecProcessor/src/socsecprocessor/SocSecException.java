/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package socsecprocessor;

/**
 *
 * @author PolinaYoga
 */
public class SocSecException extends Exception{
    public String error;
    
    public SocSecException(String error)
    {
       super(error);
       this.error = "Invalid Social Security Number: " + error;
       
    }
    public String toString() {
        return "Invalid Social Security Number, " + error; 
    }   
}

