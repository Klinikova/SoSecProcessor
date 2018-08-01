package conditionaloperator;

public class ConditionalOperator {

    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        
        //bill for least 5 hours for  no matter what
        int hours, hoursToBill; // to storehours worked: ");
        System.out.println ("Enter number of hours worked: ");
        hours = keyboard.nextInt();
        hoursToBill = hours < 5 ? 5 : hours; 
        System.out.println ("Hours billed: " + hoursToBill);
        
        message = grade > 90 ? "Honors"
        System.out.println ("");
    }
    
}
