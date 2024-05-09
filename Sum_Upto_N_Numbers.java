/* Keep taking numbers as inputs till the
   user enters ‘x’, after that print sum of all.*/
import java.util.Scanner;
public class Sum_Upto_N_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = 0 ;
        while(true){
            System.out.println("Enter a number (or 'x' to exit )");
            String input = sc.next();
            if(input.equals("x")){
                System.out.println("Total = "+total);
                break;
            }
            else{
                try{
                    int number = Integer.parseInt(input);
                    total += number;
                }catch(Exception e){
                    System.out.println("Invalid Input. And the error is "+e);
                    break;
                }
            }
        }
    }
}
