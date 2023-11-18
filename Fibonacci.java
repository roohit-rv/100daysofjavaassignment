import java.util.Scanner;
public class Fibonacci{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n,t1=1,t2=1,term;
        System.out.println("Enter the number of terms for fibonacci series");
        n=scn.nextInt();
        System.out.print("the Series is - 1, 1, ");
        for(int i=3;i<=n;i++){
            term=t1+t2;
            System.out.print(term + ", ");
            t1=t2;
            t2=term;
        }
    }
}