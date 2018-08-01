/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg01;

/**
 *
 * @author PolinaYoga
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double totalIncome = 0.0;
        while (inputFile.hasNext()){
            try{
                totalIncome += inputFile.nextDouble(0:)
            }
            catch(InputMismatchException e){
                System.out.println("Non-numeric data encountered " + "in the file.");
                inputFile.nextLine();
            }
            finally{
                totalIncome = 35.5;
            }
        }
    }
    
}
