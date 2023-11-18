import java.util.Scanner;
public class TwoDifferentStringSameLinePrint{
    public static void main(String[] args){
        String s1,s2;
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter two words");
        s1=scn.nextLine();
        s2=scn.nextLine();
        System.out.println(s1+s2);
    }
}