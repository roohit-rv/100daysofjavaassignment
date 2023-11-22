import java.util.Scanner;
public class SumOfDecimalNumberAndResultInBinaryNumber{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n,num=0,parity,power=1,ans=0;
        System.out.println("Enter any Natural Number");
        n=scn.nextInt();
        int number=n;
        for(int i=1;i<=n;i++){
            num+=i;
        }
        while(num!=0){
            parity=num%2;
            ans+=parity*power;
            power*=10;
            num/=2;
        }
        System.out.println("The sum of the Nautral number form 0 to " + number + " in binary number is " + ans);
    }
}