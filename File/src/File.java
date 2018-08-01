import java.io.*;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;

public class File {

	public static void main(String[] args) throws Exception 
        {
            FileReader file = new FileReader("C:/Polina/words.txt");
            BufferedReader reader = new BufferedReader(file);
            
                String text = "";
                String line = reader.readLine();
                while(line != null)
                {
                    text += line;
                    line = reader.readLine();
                }
                System.out.println(text);
        }  
}        