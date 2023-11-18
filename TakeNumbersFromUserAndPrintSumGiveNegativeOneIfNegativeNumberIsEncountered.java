import java.util.Scanner;
public class TakeNumbersFromUserAndPrintSumGiveNegativeOneIfNegativeNumberIsEncountered{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int num,ans=0,number,flag=0;
        System.out.println("Enter how many numbers you want to enter ");
        num=scn.nextInt();
        for(int i=0;i<num;i++){
            System.out.println("Enter the number");
            number=scn.nextInt();
            if(number<0){
                flag=1;
            }
            ans=number+ans;
        }
        if (flag==1){
            System.out.println("Answer=-1");
        }
        else{
            System.out.println("Answer=" + ans);
        }

    }
}