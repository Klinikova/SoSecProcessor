package average;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author PolinaYoga
 */
public class Average {

    private int[] data;//
    private double mean; //
    
    public Average(){ //
        final int size = 5; // This class will allow a user to enter 5 sizes into an array.
        data = new int[size]; // Array of data
        
        // Create a Scanner object to read from the keyboard
        Scanner keyboard = new Scanner (System.in);
        
        for (int i = 0; i < size; i++){ //
            // prompt for value
            System.out.println("Please enter a number: ");
            int number = keyboard.nextInt();
            
            // put that value in data array
            data[i] = number;
        }
        
        calculateMean(); // Pass the array to the calculateMean method 
        
        selectionSort();
 
    }
 
    public void calculateMean(){
        double total = 0; // Initialize accumulator
        for (int i = 0; i < data.length; i++){
            total += data[i];
            mean = total / data.length; 
        }
    }
    
    public String toString(){ 
        String arrayToString = Arrays.toString(data); // набор в String
        String meanToString = Double.toString(mean);
        String result = "Array: " + arrayToString + ". Mean: " + meanToString + ".";
        return result; //returns a String containing data in descending order and the mean. 
    }
    
    public void selectionSort(){ //this method uses the selection sort algorithm to rearrange the data set from highest to lowest. 
        
        int max;
        for (int i = 0; i < data.length; i++)
        {
            // Assume first element is max
            max = i;
            for (int j = i + 1; j < data.length; j++)
            {
                if (data[j] > data[max])
                {
                    max = j;
                }
            }

            if (max != i)
            {
               int temp = data[i];
               data[i] = data[max];
               data[max] = temp;
            }
        }
    }
         
    /*
    public static void main(String[] args) {
        // TODO code application logic here
            
    } */   
        
}