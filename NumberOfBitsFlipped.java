import java.util.Scanner;
public class NumberOfBitsFlipped{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int a,b,c,count=0;
        System.out.println("Enter two numbers");
        a=scn.nextInt();
        b=scn.nextInt();
        c=a^b;
        while(c!=0){
            c=c&(c-1);
            count++;
        }
        System.out.println("Number of bits flipped are " + count);

    }
}