package randomdice;
import java.io.PrintWriter;
import java.io.File;
import java.io.FileNotFoundException;
import static java.lang.Math.random;
import java.util.Random;
import java.util.Scanner;

public class RandomDice {

public static void main(String[] args) throws FileNotFoundException
{
Scanner keyboard = new Scanner(System.in);
PrintWriter output = new PrintWriter("C:/Users/PolinaYoga/Documents/NetBeansProjects/twoDice.txt");
int countTwo = 0; 
int countThree = 0;
int countFour = 0;
int countFive = 0;
int countSix = 0;
int countSeven = 0;
int countEight = 0;
int countNine = 0;
int countTen = 0;
int countEleven = 0;
int countTwelve = 0;

System.out.println("How many times do you want to roll the dice?");
int rollAmount = keyboard.nextInt();

Random rnd = new Random();

while (rollAmount > 0)
{
    int diceOne = rnd.nextInt(6) + 1;
    int diceTwo = rnd.nextInt(6) + 1;
    int sum = diceOne + diceTwo;
    output.println(sum);
    rollAmount -=1;
    
    if(sum==2){
        countTwo += 2;
}
 if(sum==3){
        countThree += 3;
}
  if(sum==4){
        countFour += 4;
}
   if(sum==5){
        countFive += 5;
}
    if(sum==6){
        countSix += 6;
}
 if(sum==7){
        countSeven += 7;
}
  if(sum==8){
        countEight += 8;
}
   if(sum==9){
        countNine += 9;
}
    if(sum==10){
        countTen += 10;
}
     if(sum==11){
        countEleven += 11;
}
      if(sum==12){
        countTwelve += 12;
}
      
      
      
}   // end of while loop


output.println("Twos: " + countTwo);
output.println("Threes: " + countThree);
output.println("Fours: " + countFour);
output.println("Fives: " + countFive);
output.println("Sixs: " + countSix);
output.println("Sevens: " + countSeven);
output.println("Eights: " + countEight);
output.println("Nines: " + countNine);
output.println("Tens: " + countTen);
output.println("Elevens: " + countEleven);
output.println("Twelves: " + countTwelve);


output.close();
    }
}



