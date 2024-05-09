// Program to check all the factors of user entered number.
import java.util.Scanner;
public class Factors_Of_a_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();

        System.out.printf("Factors of the number %d are :\n",num);
        for(int i=1;i<=(num/2);i++){
            for(int j=1;j<=(num/2);j++){
                if((i*j)==num){
                    System.out.printf("%d * %d = %d\n",i,j,num);
                }
            }
        }
    }
}
