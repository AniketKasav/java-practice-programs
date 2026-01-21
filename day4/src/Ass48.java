import java.util.Scanner;

public class Ass48 {
//    Q48. Write a Java program to print Pass if marks are 40 or above, otherwise Fail.
//            Input : Marks = 38
//    Output : Fail
//    Explanation : Marks are below the passing criteria.

    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the marks : ");
        int marks=sc.nextInt();

        System.out.println(marks>=40?"Pass":"Fail");


    }
}
