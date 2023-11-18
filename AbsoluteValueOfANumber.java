import java.util.Scanner;
public class AbsoluteValueOfANumber{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int num;
        System.out.println("Enter any number");
        num=scn.nextInt();
        if(num>0){
            System.out.println(num);
        }
        else{
            System.out.println(num*-1);
        }
    }

}