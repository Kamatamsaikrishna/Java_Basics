/*Write a program to input principal, time,
  and rate (P, T, R) from the user and find Simple Interest.*/
import java.util.Scanner;
public class Simple_Interest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the principal,interest and time : ");
        double p = sc.nextDouble();
        double t = sc.nextDouble();
        double r = sc.nextDouble();
        double simpleInterest = (p*t*r)/100;
        System.out.printf("Simple Interest for the given values is %f",simpleInterest);
    }
}
