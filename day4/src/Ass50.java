import java.util.Scanner;

public class Ass50 {
//    Q50. Write a Java program to check whether a number is a perfect square using a ternary operator.
//            Input : Number = 49
//    Output : Perfect Square
//    Explanation : 7 × 7 = 49.

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number : ");
        double n=sc.nextDouble();
//        int i=1;
//        boolean issquare=false;
//        while(i*i<=n){
//            if(i*i==n){
//                issquare=true;
//                break;
//            }
//            i++;
//        }
//        System.out.println(n<0?"Not a perfect square":issquare?"number is perfect square":"not a perfect square");
//        or solution
        double sqrt=Math.sqrt(n);
        System.out.println(sqrt*sqrt==n?"number is perfect square":"not a perfect square");

    }

}
