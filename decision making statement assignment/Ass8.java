import java.util.Scanner;

public class Ass8LeapYear {
//    Q8. Write a Java program to check whether a year is a leap year or not.

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the year : ");
        int y=sc.nextInt();
        if(y%400==0){
            System.out.println("Given year is leap year");
        }else if(y%100!=0 && y%4==0){
            System.out.println("Given year is leap year ");
        }else{
            System.out.println("Given year is not leap year");
        }


        sc.close();

    }


}

