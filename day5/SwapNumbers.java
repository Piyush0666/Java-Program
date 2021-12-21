public class SwapNumber

{
    public static void main(String[] args){
        int a = 100;
        int b = 30;
        int c;

        System.out.println("......BEFORE SWAPPING.....");
        System.out.println("First number = " + a);
        System.out.println("Second number = " + b);

        c = a;
        a = b;
        b = c;

        System.out.println("......AFTER SWAPPING.....");
        System.out.println("First number = " + a);
        System.out.println("Second number = " + b);
    }
}
