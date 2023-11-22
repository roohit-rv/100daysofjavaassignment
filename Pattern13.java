import java.util.Scanner;
public class Pattern13{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int r;
        r=scn.nextInt();
        for(int i=1;i<=r;i++){
            for(int j=1;j<=r;j++){
                if(i==j || i+j==r+1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}