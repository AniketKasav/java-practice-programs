import java.util.Scanner;

public class DaysConversion {
    public static void main(String[] args){
//        Q18. Write a Java program to convert days into years, months, and weeks.
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of days :");
        int days=sc.nextInt();
        int year=days/365;
        days=days-year*365;
        int month=days/28;
        days=days-month*28;
        int week=days/7;
        days=days-week*7;
        System.out.println("Year :"+year);
        System.out.println("month :"+month);
        System.out.println("week :"+week);
        System.out.println("Remaining days :"+days);


    }
}
