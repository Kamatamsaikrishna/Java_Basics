/*To find out whether the given String is Palindrome or not.*/

// 1 - Number Palindrome .
import java.util.Scanner;
public class Palindrome_Or_Not {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int temp1 = number;
        int reverse=0,temp;
        while(number!=0){
            temp = number % 10 ;
            reverse = temp + (reverse*10) ;
            number = number / 10 ;
        }
        if(temp1 == reverse){
            System.out.println("Palindrome Number.");
        }
        else{
            System.out.println("Not a Palindrome Number.");
        }
    }
}
