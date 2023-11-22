import java.util.Scanner;
public class CountTheNumberOfZeroesOfNaturalNumberInBinaryForm{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n,d,c=0,power=1,num=0,parity;
        System.out.println("Enter any natural number");
        n=scn.nextInt();
        while(n!=0){
            parity=n%2;
            num+=parity*power;
            power*=10;
            n/=2;
        }
        System.out.println(num);
        while(num!=0){
            d=num%10;
            if(d==0){
                c++;
            }
            num/=10;
        }
        System.out.println("It has " + c + " zeroes in it's binary form");
    }
}