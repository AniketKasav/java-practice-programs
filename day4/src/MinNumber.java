import java.util.Scanner;

public class MinNumber {
//    Q48. Write a Java program to find the minimum among three numbers.
//            Input:
//    A = 6
//    B = 3
//    C = 9
//    Output : Minimum = 3
//    Explanation : 3 is the smallest number.

    public static void main(String[] args){

    Scanner sc=new Scanner(System.in);
        System.out.print("enter the first number : ");
        int a=sc.nextInt();
        System.out.print("enter the second number : ");
        int b=sc.nextInt();
        System.out.print("enter the third number : ");
        int c=sc.nextInt();

        // optimal solution
        int min=a;
        if(b<min){
            min=b;
        }
        if(c<min){
            min=c;
        }

        System.out.printf("%d is the smallest number",min);


    }
}
