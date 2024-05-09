import java.util.Scanner;
public class Sum_Of_Two_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a and b :");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a + b ;
        System.out.printf("The sum of %d and %d is %d",a,b,sum);
    }
}
