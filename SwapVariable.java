import java.util.Scanner;
public class SwapVariable{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter first number ");
        a=scn.nextInt();
        System.out.println("Enter the second number ");
        b=scn.nextInt();
        System.out.println("The value of a is " + a + " and value of is " + b +" before swapping");
        c=a;
        a=b;
        b=c;
        System.out.println("the value of a is " + a + " and the value of b is " + b + " after swapping");

    }
}