import java.util.Random;
import java.util.Scanner;
public class FlipCoin
{
    public static void main(String[] args)
    {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        int noOfInput = sc.nextInt();
        for (int i=0; i<noOfInput; i++)
        {
            int headOrTail = random.nextInt(2);
            if (headOrTail == 0)
            {
                System.out.println("head..!");
            } else
            {
                System.out.println("tails..!");
            }
        }
    }
}