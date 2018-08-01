package loops;
import java.util.Scanner;
public class BreakStatements
{
public static void main(String[] args)
{
Scanner input = new Scanner(System.in);
int number;
    number = 0;
while (true)
{
System.out.println("Enter a number between 1 and 100");
number = input.nextInt();
if (number >= 1 && number <= 100)
{
break;
}
}
}
}
    

