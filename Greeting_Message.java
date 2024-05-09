/* Take name as input and print a greeting
   message for that particular name.*/

import java.util.Scanner;
public class Greeting_Message {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name : ");
        String name = sc.nextLine();
        System.out.printf("Hello %s. How are you !",name);
    }
}
