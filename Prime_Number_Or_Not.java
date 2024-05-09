// Program to check whether user entered number is prime or not.

// Using for loop
//import java.util.Scanner;
//public class Prime_Number_Or_Not {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the number : ");
//        int number = sc.nextInt();
//        int count = 0;
//        for(int i=1;i<=Math.sqrt(number);i++){
//            if((number%i) == 0){
//                count++;
//            }
//        }
//        if(count==2){
//            System.out.printf("%d is prime number.",number);
//        }
//        else{
//            System.out.printf("%d is not a prime number.",number);
//        }
//    }
//}

//using while loop
import java.util.Scanner;
public class Prime_Number_Or_Not{
    public static String primeNumber(int number){
        int temp = 2;
        while(temp<number){
            if(number%temp == 0){
                return "Not prime";
            }
            temp++;
        }
        return "Prime Number";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int number = sc.nextInt();
        System.out.println(Prime_Number_Or_Not.primeNumber(number));
    }
}