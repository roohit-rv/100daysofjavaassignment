import java.util.Scanner;
public class PrimeNumberAsSumOfTwoPrimeNumbers {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num, flag = 0;
        System.out.println("Enter any prime number");
        num = scn.nextInt();
        if(isPrime(num) && isPrime(num-2)){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
    }
    public static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
            for(int i=2; i*i<=n;i++){
                if(n%i==0){
                    return false;
                }
            }
            return true;
    }
  }
  /*   BRUTE FORCE
  ------------------------------------------------------------------

  for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                flag = 2;
                break;
            }
        }
        if (flag == 0) {
            for (int i = 2; i < num - 2; i++) {
                if ((num - 2) % i == 0) {
                    flag = 1;
                    break;
                }
            }
            if (num == 2) {
                System.out.println("No, " + num + " cannot be represented as a sum of two prime numbers");
            } else {
                if (flag == 1) {
                    System.out.println("No, " + num + " cannot be represented as a sum of two prime numbers");
                } else {
                    if (((num - 2) + 2) == num) {
                        System.out.println("Yes, " + num + " can be represented as a sum of two prime numbers");
                    } else {
                        System.out.println("No, " + num + " cannot be represented as a sum of two prime numbers");
                    }
                }
            }
        }


         else

        {
            System.out.println("Input number provided is itself not a prime number");
        }
      ----------------------------------------------------------------------------------------
   */

