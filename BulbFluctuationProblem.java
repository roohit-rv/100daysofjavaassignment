import java.util.Scanner;
public class BulbFluctuationProblem{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n;
        System.out.println("Enter the number of Bulbs");
        n=scn.nextInt();
        for(int i=1;i*i<=n;i++){
            System.out.println(i*i + " ");
        }
    }
}