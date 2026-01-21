import java.util.Scanner;

public class Ass57 {
//    Q57. Write a java program to determine bonus based on performance rating.
//            Input : Rating = 9
//    Output : 15% Bonus
//    Explanation : Rating greater than 8 gets 15% bonus.

    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Rating (out of 10) : ");
        int rate=sc.nextInt();
        System.out.println(rate>8?"15% Bonus":"Not Applicable for Bonus");

    }

}
