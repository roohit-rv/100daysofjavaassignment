import java.util.Scanner;
public class TakeTwoNumbersAsInputAndReturnTheirSum{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("enter the number of test cases ");
        int t;
        t=scn.nextInt();
        for(int i=0; i<t; i++){
            int a,b;
            System.out.println("Enter two numbers");
            a=scn.nextInt();
            b=scn.nextInt();
            System.out.println(a+b);
        }
    }
}
