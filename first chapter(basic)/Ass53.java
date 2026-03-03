import java.util.Scanner;

public class Ass53 {
//    Q53. Write a java program to check eligibility based on percentage and income.
//    Input:
//    Percentage = 78
//    Income = 180000
//    Output : Eligible
//    Explanation : Percentage ≥ 75 and income < 200000.

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the percentage : ");
        int p=sc.nextInt();
        System.out.print("Enter income : ");
        int i=sc.nextInt();

        System.out.println(p>=75 && i<200000 ? "Eligible" : "Not Eligible");

    }
}
