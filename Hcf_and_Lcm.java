import java.util.Scanner;

public class Hcf_and_Lcm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the first number
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        // Input the second number
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        // Calculate HCF and LCM
        int hcf = calculateHCF(num1, num2);
        int lcm = calculateLCM(num1, num2, hcf);

        // Output the results
        System.out.println("HCF of " + num1 + " and " + num2 + " is: " + hcf);
        System.out.println("LCM of " + num1 + " and " + num2 + " is: " + lcm);

        scanner.close();
    }

    // Method to calculate HCF (GCD) using Euclidean algorithm
    private static int calculateHCF(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Method to calculate LCM using HCF
    private static int calculateLCM(int a, int b, int hcf) {
        return (a * b) / hcf;
    }
}
