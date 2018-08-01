import java.io.*;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;

public class h1 {

	public static void main(String[] args) throws Exception 
        {
            FileReader file = new FileReader("C:/Users/PolinaYoga/Documents/NetBeansProjects/h1/word.txt");
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
                /**
		// TODO Auto-generated method stub
		//input the file
		
		Scanner input = new Scanner(file);
		String[] save = new String[10000];
		int i=0;
		while(input.hasNext()){
			save[i] = input.next();
			i++;
		}
		input.close();
		//guess process
		while(true){
			guess(save);
			System.out.println("Do you want to guess for another word? Y or N?");
			
		}
	}
	
	public static void  guessword(String guessword) throws IOException{
		int length = guessword.length();
		int tone = 0;
		char[] hidechar = new char[length];
		for(int i = 0; i < length; i++){
			hidechar[i] = '*';
		}
		String hiddeneword = String.valueOf(hidechar);
		while(!hiddeneword.equals(guessword)){
			int flag = 0;
			System.out.println("Enter a letter in word "+ hiddeneword);
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			char test=(char)br.read();
			for(int i = 0; i < length; i++){
				if(guessword.charAt(i) == test){
					hidechar[i] = test;
					flag = 1;
				}
			}
			if(flag!=1){
				tone++;
				System.out.println(test+" is not in the word.");
				}
			hiddeneword = String.valueOf(hidechar);
		}
		System.out.println("Congratulations! You win!");
		System.out.println("Wrong " + tone + " times.");
	}
	
	public static void  guess(String[] save) throws IOException{
		int k = (int)(Math.random() * (save.length));
		String guessword = save[k];
		//guess process
		guessword(guessword);
	}
        */

