import java.util.Scanner;
public class Pattern15{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int r;
        System.out.println("Enter the number of rows");
        r=scn.nextInt();
        for(int i=1;i<=r;i++){
            for(int j=1;j<=r;j++)
           if(i==(r/2)+1){
               System.out.print("*");
           }
           else{
               if(j==(r/2)+1){
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