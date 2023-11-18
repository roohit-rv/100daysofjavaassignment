import java.util.Scanner;
public class SwapWithoutUsingAThirdVariable{
    public static void main(String[] args){
        int a, b;
        Scanner scn = new Scanner(System.in);
        System.out.println("enter two numbers");
        a=scn.nextInt();
        b=scn.nextInt();
        System.out.println("a=" + a + "\n" + "b=" +  b);
        System.out.println("Swapping the values of both variable without the use of third variable");
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("a=" + a + "\n" + "b=" +  b);

    }
}