/*Take in two numbers and an operator (+, -, *, /)
  and calculate the value. (Use if conditions)*/
import java.util.Scanner;
public class Adding_Using_Operators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a : ");
        double a = sc.nextDouble();
        System.out.print("Enter the Operator : ");
        String oper = sc.next();
        System.out.print("Enter the value of b : ");
        double b = sc.nextDouble();
        if(oper.equals("+")){
            System.out.printf("Sum of A and B is %f",(a+b));
        }
        else if(oper.equals("-")){
            System.out.printf("Difference of A and B is %f",(a-b));
        }
        else if(oper.equals("*")){
            System.out.printf("Product of A and B is %f",(a*b));
        }
        else if(oper.equals("/")){
            System.out.printf("Division of A and B is %f",(a/b));
        }
        else if(oper.equals("%")){
            System.out.printf("Modulo of A and B is %f",(a%b));
        }
    }
}
