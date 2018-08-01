package averageincome;
import java.util.Scanner;
public class AverageIncome
{
public static void main(String[] args)
{
Scanner keyboard = new Scanner(System.in);
System.out.println("Enter total income: ");
double income = keyboard.nextDouble();
System.out.println("How many pay periods? ");
int nPer = keyboard.nextInt();
if (nPer < 1)
{
System.out.println("Number of periods must be greater than 0.");
} 
else
{
System.out.println("Average income is " + (income / nPer));
}
}
}
    
    

