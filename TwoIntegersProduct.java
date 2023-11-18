import java.util.Scanner;
public class TwoIntegersProduct{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int num1, num2, product;
        System.out.println("Enter first integer number");
        num1=scn.nextInt();
        System.out.println("Enter first integer number");
        num2=scn.nextInt();
        product=num1*num2;
        System.out.println("the product of the given integers is " + product);


    }

}