import java.util.Scanner;
public class NegativeNumberSkipped{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int num;
        System.out.println("Enter any num");
        num=scn.nextInt();
        if(num>0){
            System.out.println("Number is positive and entered");
        }
        else{
            System.out.println("Number is negative and skipped");
        }

    }
}