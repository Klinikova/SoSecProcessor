/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package twodimentionalarrays;

/**
 *
 * @author PolinaYoga
 */
public class TwoDimentionalArrays {

    public static void main(String[] args) {
        int[][]b = {{2,5}, {11,3}};
        
        for (int i = 0; i < b.length; i++){
            for (int j = 0; j < b[i].length; j++){
            System.out.print(b[i][j] + " ");
            }
        System.out.println();
            
        }
    }
    
}
