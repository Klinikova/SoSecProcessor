/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package countable;

/**
 *
 * @author PolinaYoga
 */
public class Countable {

    
    //the declaration of the static field named instanceCount
    private static int instanceCount = 0;
    
    
    public Countable()
    {
        instanceCount++;
    }
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
