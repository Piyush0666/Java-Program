import java.util.Scanner;
public class LargestNumber
{
    public static void main(String[] args){
        int a;
        int b;
        int c;
        System.out.println("Enter the value of a");
        Scanner obj = new Scanner(System.in);
        a = obj.nextInt();
        System.out.println("Enter the value of b");
        Scanner sc = new Scanner(System.in);
        b = sc.nextInt();

        System.out.println("Enter the value of c");
        Scanner dc = new Scanner(System.in);
        c = dc.nextInt();
        if(a>b && a>c)
        {
            System.out.println("a is greatest");
        }
        else if (b>a && b>c){
                System.out.println("b is greatest");
            }
        else{
            System.out.println("c is greatest");

        }
        }


    }

