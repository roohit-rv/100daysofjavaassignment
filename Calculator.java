import java.util.Scanner;
public class Calculator{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int i=1;
        while(i==1){
            char op;
            float a,b;
            System.out.println("Enter + to add");
            System.out.println("Enter - to subtract");
            System.out.println("Enter * to multiply");
            System.out.println("Enter / to divide");
            System.out.println("Enter e to exit");
            op=scn.nextLine().charAt(0);
            switch(op){
                case '+':
                    System.out.println("Enter two numbers");
                    a=scn.nextFloat();
                    b=scn.nextFloat();
                    scn.nextLine();
                    System.out.println("addition is " + (a+b));
                    break;
                case '-':
                    System.out.println("Enter two numbers");
                    a=scn.nextFloat();
                    b=scn.nextFloat();
                    scn.nextLine();
                    System.out.println("subtraction is " + (a-b));
                    break;
                case '*':
                    System.out.println("Enter two numbers");
                    a=scn.nextFloat();
                    b=scn.nextFloat();
                    scn.nextLine();
                    System.out.println("multiplication is " + (a*b));
                    break;
                case '/':
                    System.out.println("Enter two numbers");
                    a=scn.nextFloat();
                    b=scn.nextFloat();
                    scn.nextLine();
                    System.out.println("division is " + (a/b));
                    break;
                case 'e':
                    System.out.println("Successfully exited");
                  i=0;
                    break;
                default:
                    System.out.println("Enter valid input");
                    break;
            }

        }
    }
}