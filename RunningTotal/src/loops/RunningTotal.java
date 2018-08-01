package loops;
import java.util.Scanner;
public class RunningTotal
{
public static void main(String[] args)
{
double total = 0; //accumulator variable
Scanner input = new Scanner(System.in);
double value = 0;
int day = 1;
while (value != -1)
{
System.out.println("Enter sales for day " + day);
value = input.nextDouble();
if (value != -1) {
total += value; //increments total by daily sale amount
}
System.out.printf("Total: $%.2f\n", total);
{
}


