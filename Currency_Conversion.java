/*Input currency in rupees and output in USD.*/
import java.util.Scanner;
public class Currency_Conversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the amount in Indian Currency : ");
        double ind_currency = sc.nextDouble();
        double us_currency = (ind_currency/83.38);
        System.out.printf("%.2f Indian Currency is Equal to %.2f US Dollar.",ind_currency,us_currency);
    }
}
