// Condition - (year%4 == 0) && (year%100 != 0) || (year %400 == 0)
import java.util.Scanner;
public class Leap_year {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year to check leap year : ");
        int year = sc.nextInt();
        if((year%4 == 0) && (year%100 != 0) || (year %400 == 0)){
            System.out.printf("%d is leap year.",year);
        }
        else{
            System.out.printf("%d is not a leap year.",year);
        }
    }
}
