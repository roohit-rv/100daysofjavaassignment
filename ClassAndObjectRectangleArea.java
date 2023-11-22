import java.util.Scanner;
class Area{
    int l,b;
    Area(int x, int y){
        l=x;
        b=y;
    }
    public int getArea(){
        return l*b;
    }
}
public class ClassAndObjectRectangleArea{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int x,y;
        System.out.println("Enter the length and breadth of the Rectangle");
        x=scn.nextInt();
        y=scn.nextInt();
        Area a = new Area(x,y);
        System.out.println("Area of rectangle is " + a.getArea());
    }
}