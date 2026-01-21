import java.util.Scanner;
public class MaxNoAmongThreeNo {
    public static void main(String [] args){
//        Q41. Write a Java program to find the maximum among three numbers.
//                Input:
//        A = 10
//        B = 25
//        C = 15
//        Output : Maximum = 25
//        Explanation : 25 is the largest among the three numbers.

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the fist number :");
        int a=sc.nextInt();
        System.out.print("Enter the second number :");
        int b=sc.nextInt();
        System.out.print("Enter the third number :");
        int c=sc.nextInt();
//        if(a>b && a>c){
//            System.out.printf("%d is maximum ",a);
//        }else if(b>c && b>a){
//            System.out.printf("%d is maximum ",b);
//        }else{
//            System.out.printf("%d is maximum ",c);
//
//        }
//        optimal

        int max=a;
        if(b>max){
            max=b;
        }
        if(c>max){
            max=c;
        }
        System.out.println("the max number is :"+max);
    }
}
