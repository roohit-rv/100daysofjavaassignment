import java.util.Scanner;
public class CreatingClassAndObject{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        Student s1 = new Student();
        System.out.println("Enter the name and roll number of the Student");
        s1.name=scn.nextLine();
        s1.roll_no=scn.nextInt();
        System.out.println(s1.name + " " + s1.roll_no);
    }
}
class Student{
    String name;
    int roll_no;
}