import java.util.Scanner;
public class ReturnGreatestBinaryNumberInDecimalFrom{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int a,b,c=0,d=0,parity1,power1=1,parity2,power2=1;
        System.out.println("Enter first binary number");
        a=scn.nextInt();
        System.out.println("Enter second bianry number");
        b=scn.nextInt();
        while(a!=0){
            parity1=a%10;
            c+=parity1*power1;
            power1*=2;
            a/=10;
        }
        while(b!=0){
            parity2=b%10;
            d+=parity2*power2;
            power2*=2;
            b/=10;
        }
        if(c>d){
            System.out.println(c + " is greater");
        }
        else if(c<d){
            System.out.println(d + " is greater");
        }
        else{
            System.out.println((c + " and " + d + " are equal"));
        }
    }
}