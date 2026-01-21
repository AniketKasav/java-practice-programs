import java.text.NumberFormat;
import java.util.Scanner;

public class mini_project {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Principle : ");
        int pri=sc.nextInt();
        System.out.print("Annual Interest Rate : ");
        double Rate=sc.nextDouble();
        System.out.print("Period(Years):");
        int period=sc.nextInt()*12; // convert year into month
        double rate=(Rate/100)/12;   // convert rate into percentage and then convert annul rate into month rate
        System.out.print("Mortgage :");
        double nr=rate*Math.pow((1+rate),period);
        double dr=Math.pow((1+rate),period)-1;
        double num=pri*(nr/dr);
        String mortgage=NumberFormat.getCurrencyInstance().format(num);

        System.out.print(mortgage);

    }
}
