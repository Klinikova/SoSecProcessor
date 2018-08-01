import java.util.Random;

public class CoinTosses 
{

    public static void main(String[] args)
    {
        Random rnd = new Random();
    for (int count = 0; count < 10; count++)
    {
        if (rnd.nextInt(2) == 0)
            System.out.println("Tails");
        else
            System.out.println("Heads");
        }
    }
}
