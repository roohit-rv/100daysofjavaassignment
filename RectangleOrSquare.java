import java.util.Scanner;
public class RectangleOrSquare{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int l,b;
        System.out.println("Enter the length and breadth of the figure");
        l=scn.nextInt();
        b=scn.nextInt();
        if(l==b){
            System.out.println("It is a square");
        }
        else{
            System.out.println("it is a rectangle");
        }
    }
}