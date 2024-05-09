/*To calculate Fibonacci Series up to n numbers.*/
import java.util.Scanner;
public class Fibonacci_Series {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n : ");
        int n = sc.nextInt();
        int t1 = 0 ;
        int t2 = 1;
        int next_term = t1+t2;
        System.out.println("Fibonacci Series : ");
        System.out.printf("%d %d %d",t1,t2,next_term);
        for(int i=3;i<n;i++){
            t1 = t2 ;
            t2 = next_term;
            next_term = t1 + t2 ;
            System.out.print(" "+next_term);
        }
    }
}
