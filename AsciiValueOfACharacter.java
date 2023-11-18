import java.util.Scanner;
public class AsciiValueOfACharacter{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        char ch;
        System.out.println("Enter any character ");
        ch=scn.next().charAt(0);
        int value=ch;
        System.out.print("ASCII value of " + ch + " is " + value);
    }
}