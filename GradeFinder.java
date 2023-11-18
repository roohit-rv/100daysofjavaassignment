import java.util.Scanner;
public class GradeFinder{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int marks;
        System.out.println("Enter your marks");
        marks=scn.nextInt();
        if (marks <= 100 && marks >= 90) {
            System.out.println("Your grade is A+");
        } else if (marks <= 100 && marks >= 90) {
            System.out.println("Your grade is A");
        } else if (marks <= 89 && marks >= 70) {
            System.out.println("Your grade is B+");
        } else if (marks <= 70 && marks >= 60) {
            System.out.println("Your grade is B");
        } else if (marks <= 60 && marks >= 50) {
            System.out.println("Your grade is C");
        } else if (marks <= 50 && marks >= 40) {
            System.out.println("Your grade is D");
        } else if (marks <= 40 && marks >= 30) {
            System.out.println("Your grade is E");
        } else if (marks <= 30 && marks >= 0) {
            System.out.println("Your grade is F");
        } else {
            System.out.println("Enter Valid Input");
        }
    }
}