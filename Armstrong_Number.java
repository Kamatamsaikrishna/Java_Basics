/*To find Armstrong Number between two given number.
  1^3 + 5^3 + 3^3 equals 153.*/
import java.util.Scanner;
public class Armstrong_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of num : ");
        int number = sc.nextInt();
        int num = number;
        double temp,sum=0;
        double len = String.valueOf(num).length();
        while(num!=0){
            temp = num%10;
            sum += Math.pow(temp,len);
            num = num/10;
        }
        if(sum == number){
            System.out.printf("%d is a armstrong number .",number);
        }
        else{
            System.out.printf("%d is not a armstrong number.",number);
        }
    }
}
