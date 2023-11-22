import java.util.Scanner;
public class Pattern14{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int r;
        System.out.println("Enter the number of rows");
        r=scn.nextInt();
        for(int i=1;i<=r;i++){
            char c='A';
            for(int j=r-i;j>0;j--){
                System.out.print(" ");
            }
            for(int k=1;k<=2*i-1;k++){
                System.out.print(c);
                c++;
            }
            System.out.println();
        }
        for(int i=r-1;i>0;i--){
            char c='A';
            for(int j=r-i;j>0;j--){
                System.out.print(" ");
            }
            for(int k=1;k<=2*i-1;k++){
                System.out.print(c);
                c++;
            }
            System.out.println();
        }
    }
}