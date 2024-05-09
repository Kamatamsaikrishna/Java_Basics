/* Take input of a salary. If the salary is greater than 10000
   add bonus as 2000, Otherwise add bonus as 10000.
 */
import java.util.Scanner;
public class Increment_Salary_By_Bonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the salary of an employee : ");
        int salary = sc.nextInt();
        int bonus;
        if(salary>0 && salary<=10000){
            bonus = 2000;
        }
        else{
            bonus = 10000;
        }
        System.out.printf("The employee with %d salary will get %d bonus "+
                "And in total he will get %d rupees.",salary,bonus,(salary+bonus));
    }
}
