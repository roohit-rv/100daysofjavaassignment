import java.util.Scanner;
public class StudentInformationInput{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int roll;
        String firstname,lastname,field;
        System.out.println("Enter your full name, roll number and field of interest ");
        firstname=scn.next();
        lastname=scn.next();
        roll=scn.nextInt();
        field=scn.next();
        System.out.println("Name : " + firstname + " " + lastname + "\nroll number : " + roll + "\nfield of interset : " + field);
    }
}