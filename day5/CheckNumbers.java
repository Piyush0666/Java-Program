import java.util.Scanner;
public class CheckNumbers

{
    public static void main(String[] args){

       Scanner sc = new Scanner (System.in);
       System.out.println("Enter a number: ");
        int num = sc.nextInt();
        if ((num^ 1) == num + 1)
        {
            System.out.println("The enter number "+ num+" is Even ");
        }
        else{
            System.out.println("Number is odd");
        }
    }
}
