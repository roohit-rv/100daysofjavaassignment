import java.util.Scanner;
public class CubeOfANumber{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int a;
        System.out.println("Enter any number ");
        a=scn.nextInt();
        a=a*a*a;
        System.out.println("cube of the given number is " + a);
    }

}