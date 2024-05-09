/*Take 2 numbers as input and print the largest number.*/
import java.util.Scanner;
public class Larger_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number : ");
        int first_number = sc.nextInt();
        System.out.print("Enter Second Number : ");
        int second_number = sc.nextInt();
        if(first_number > second_number){
            System.out.print("First Number is greater than Second Number");
        }
        else if(first_number < second_number){
            System.out.print("First Number is lesser than Second Number");
        }
        else{
            System.out.print("Both the numbers are equal.");
        }
    }
}
