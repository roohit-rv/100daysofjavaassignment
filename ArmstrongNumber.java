import java.util.Scanner;
public class ArmstrongNumber{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int num,number,parity;
        System.out.println("Enter any number less than or equal to 1000");
        num=scn.nextInt();
        for(int i=1;i<=num;i++){
            number=i;
            int ans=0;
            while(number!=0){
                parity=number%10;
                ans+=parity*parity*parity;
                number/=10;
            }
            if(ans==i){
                System.out.println(ans + " is an Armstrong Number");
            }
        }
    }
}