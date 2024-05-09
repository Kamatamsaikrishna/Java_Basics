
import java.util.Scanner;
public class Print_Multiplication_Table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        System.out.println("Multiplication table in correct order :");
        for(int i=1;i<=10;i++){
            System.out.printf("%d * %d = %d\n",num,i,(num*i));
        }

        System.out.println("\nMultiplication table in reverse order :");
        for(int i=10;i>=1;i--){
            System.out.printf("%d * %d = %d\n",num,i,(num*i));
        }
    }
}
