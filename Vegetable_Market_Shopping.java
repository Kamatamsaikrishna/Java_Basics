/* You went to buy vegetables,and you want to buy
   them,and you need to print the total bill.*/
import java.util.Scanner;
public class Vegetable_Market_Shopping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tomato = 30;
        int beans = 75;
        int beetroot = 40;
        int bitter_guard = 80;
        int bottle_guard = 23;
        int cabbage = 22;
        boolean completed = true;
        try{
            int total_cost = 0;
            while(completed){
                System.out.println("Select the vegetables : ");
                int input = sc.nextInt();
                switch (input){
                    case 1:  //tomato
                        total_cost += tomato;
                        break;
                    case 2:  // beans
                        total_cost += beans;
                        break;

                    case 3:  // beetroot
                        total_cost += beetroot;
                        break;
                    case 4:  // bitter guard
                        total_cost += bitter_guard;
                        break;
                    case 5:  //bottle guard
                        total_cost += bottle_guard;
                        break;
                    case 6:  // cabbage
                        total_cost += cabbage;
                        break;
                    default:
                        completed = false;
                        System.out.print("Total cost of the vegetables is "+total_cost);
                        break;
                }
            }
        }catch(Exception e){
            System.out.println("Exception Occured :"+e);
        }
    }
}
