import java.util.Scanner;
public class ArithmeticOperations{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int a;
        System.out.println("Enter a number");
        a=scn.nextInt();
        System.out.println((((a+8)/3)%5)*5);
    }
}