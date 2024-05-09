// Factorial of a given number.
import java.util.Scanner;
public class Factorial_Number {
    public static int Factorial(int n){
        if(n==0 || n==1){
            return 1;
        }
        return n*Factorial(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n : ");
        int n = sc.nextInt();
        int fact = Factorial_Number.Factorial(n);
        System.out.printf("Factorial of %d is %d.",n,fact);
    }
}
