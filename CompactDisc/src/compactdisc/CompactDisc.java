package compactdisc;

import java.io.*;
import java.util.Scanner;

/**
   This program creates a list of songs for a CD
   by reading from a file.
*/

public class CompactDisc
{
    
   public static void main(String[] args)throws IOException
   {
      FileReader file = new FileReader("Classics.txt");
      BufferedReader input = new BufferedReader(file);
      String title;
      String artist;

      // ADD LINES FOR TASK #3 HERE
      // Declare an array of Song objects, called cd,
      final int size = 6; // 
      Song[] cd = new Song[size]; // Array of data with a size of 6
       
      // Create a Scanner object to read from the keyboard
      Scanner keyboard = new Scanner (System.in);
        
        for (int i = 0; i < cd.length; i++)
      {
         title = input.readLine();
         artist = input.readLine();

         // ADD LINES FOR TASK #3 HERE
         // Fill the array by creating a new song with
         // the title and artist and storing it in the
         // appropriate position in the array
         cd[i] = new Song(title, artist); 
         
         // Open the fle.
         //PrintWriter outputFile = new PrintWriter("ClassicsOut.txt");
         
         // Write the array elements to the fle.
        //for (int index = 0; index < cd.length; index++)
        //    outputFile.println(cd[index]);
        // Close the file.
        //outputFile.close();
      }
      
      input.close();
      file.close();
      
      System.out.println("Contents of Classics:");
      for (int i = 0; i < cd.length; i++)
      {
         // ADD LINES FOR TASK #3 HERE
         // Print the contents of the array to the console
        System.out.println(cd[i]);
      }
   }
}
