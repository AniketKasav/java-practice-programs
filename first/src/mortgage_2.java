import java.text.NumberFormat;
import java.util.Scanner;

public class mortgage_2 {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        // add the range for the inputs
        // for principle ₹1K to ₹1M for interest rate 1 to 30
        // years 1 to 30 and if the input invalid ask for the input upto valid input
        int principal;
        while(true){
            System.out.print("Principal(₹1K- ₹1M) : ");
            principal = sc.nextInt();
            if(principal<1000 || principal>1000000){
                System.out.println("Enter a number between 1000 to 1000000");
            }else{
                break;
            }
        }
        double rate;
        while(true){
            System.out.print("Annual Interest Rate : ");
            rate = sc.nextDouble();
            if(rate<=0 || rate >30){
                System.out.println("Enter the value greater than 0 and less than or equal to 30");
            }else{
                break;
            }
        }
        int period;
        while(true){
            System.out.print("Period (Years ) :");
            period = sc.nextInt();
            if(period <=0 || period >30){
                System.out.println("Enter the value greater than 0 and less than or equal to 30");
            }else{
                break;
            }

        }
        System.out.print("Mortgage :");
        double nr=rate*Math.pow((1+rate),period);
        double dr=Math.pow((1+rate),period)-1;
        double num=principal*(nr/dr);
        String mortgage= NumberFormat.getCurrencyInstance().format(num);
        System.out.print(mortgage);


    }
}
