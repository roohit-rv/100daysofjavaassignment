import java.util.Scanner;
public class TotalMarksAndPercentage{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter the marks of all three subjects ");
        a=scn.nextInt();
        b=scn.nextInt();
        c=scn.nextInt();
        int t;
        float p;
        t=a+b+c;
        p=((float)t/300)*100;
        System.out.println("Total marks = " + t + "\npercentage = " + p + "%");



    }
}
