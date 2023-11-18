import java.util.Scanner;
public class ProfitLoss{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int sp,cp,amt;
        System.out.println("Enter cost price");
        cp=scn.nextInt();
        System.out.println("Enter Selling price");
        sp=scn.nextInt();
        if(cp>sp){
            amt=cp-sp;
            System.out.println("Loss is " + amt);
        }
        else{
            amt=sp-cp;
            System.out.println("Profit is " + amt);
        }

    }
}