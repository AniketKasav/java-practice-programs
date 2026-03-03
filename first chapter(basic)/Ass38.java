import java.util.Scanner;

public class leapYear {
    public static void main(String[] args) {
//        Q38. Write a Java program to check whether a given year is a leap year or not.
//        Input : Year = 2024
//        Output : Leap Year
//        Explanation : A leap year is divisible by 4 and follows leap year rules.

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the year : ");
        int year = sc.nextInt();
//        if(year%400 == 0){
//            System.out.println("Given year is leap year !!!");
//        }else if(year %100 ==0){
//            System.out.println("Given year is not leap year !!!");
//        }else if(year%4==0) {
//            System.out.println("Given year is leap year !!!");
//        }else{
//            System.out.println("Given year is not leap year !!!");
//    }
//        or

        if(year %4==0){
            if(year%100==0 && year%400!=0){
            System.out.println("Given year is not a leap year !!!");
            }else{
            System.out.println("Given year is a leap year !!!");
            }
        }else{
            System.out.println("Given year is not a leap year !!!");
        }

    }
}
