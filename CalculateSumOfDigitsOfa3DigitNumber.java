import java.util.Scanner;
public class CalculateSumOfDigitsOfa3DigitNumber{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int a,b,c=0;
        System.out.println("enter a three digit number");
        a=scn.nextInt();
        while(a!=0){
            b=a%10;
            c=c+b;
            a=a/10;
        }
        System.out.println(c);
    }
}