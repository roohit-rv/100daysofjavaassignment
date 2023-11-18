import java.util.Scanner;
public class CheckingBoolean{
    public static void main(String[] args) {
        int a, b;
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the value of a and b");
        a = scn.nextInt();
        b = scn.nextInt();
        System.out.println("a<50 and a<b " + (a < 50 && a < b));
        System.out.println("a<50 or a<b " + (a<50 || a<b));
    }

}