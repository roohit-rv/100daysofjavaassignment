import java.util.Scanner;
public class StringConcatenation{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        while(true){
            System.out.println("Enter two words");
            String a = scn.next();
            String b = scn.next();
            System.out.println(a+b);

        }
    }
}