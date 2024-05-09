// Checking a user entered number is Even or Odd.
import java.util.Scanner;
public class Even_Or_Odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int number = sc.nextInt();
        if(number%2 == 0){
            System.out.printf("%d is Even Number.",number);
        }
        else{
            System.out.printf("%d is Odd Number.",number);
        }
    }
}
