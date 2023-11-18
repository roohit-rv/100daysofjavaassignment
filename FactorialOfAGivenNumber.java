import java.util.Scanner;
public class FactorialOfAGivenNumber{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter any number");
        int ans=1,num=scn.nextInt();
        for(int i=1;i<=num;i++){
            ans*=i;
        }
        if(num==0){
            System.out.println("Factorial of the given number is 0");
        }
        else{
            System.out.println("Factorial of the given number is " + ans);
        }

    }
}