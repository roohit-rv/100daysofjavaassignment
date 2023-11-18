import java.util.Scanner;
public class AreaOfARectangle{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int area, length, breadth;
        System.out.println("Enter the length of the rectangle ");
        length=scn.nextInt();
        System.out.println("Enter the breadth of the rectangle ");
        breadth=scn.nextInt();
        area=length*breadth;
        System.out.println("Area of the rectangle is " + area);
    }

}