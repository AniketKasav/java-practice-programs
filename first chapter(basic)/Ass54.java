import java.util.Scanner;

public class Ass54 {
//    Q54. Write a Java program to print the larger digit
//    between first and last digit of a three-digit number.
//    Input : Number = 582
//    Output : Larger Digit = 5
//    Explanation : First digit 5 is greater than last digit 2.

    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number (3 digit only) : ");
        int n=sc.nextInt();
        int last=n%10;
        int first=n/100;
        if(first>last){
            System.out.println("First digit "+first+" is greater than last digit "+last);
        }else{
            System.out.println("Lst digit "+last+" is greater than first digit "+first);
        }

    }
}
