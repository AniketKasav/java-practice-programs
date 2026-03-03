import java.util.Scanner;

public class SpyNumber {
//    Q26. Write a Java program to check whether a number is a Spy number.
//    Input: 1412
//    Output : Spy Number
//    Explanation : Sum = 8, Product = 8.

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number :");
        int num=sc.nextInt();
        int sum=0;
        int product=1;
        while(num>0){
            int digit= num%10;
            num=num/10;
            sum+=digit;
            product*=digit;
        }
        if(sum==product){
            System.out.println("Given number is SPY Number");
        }else{
            System.out.println("Given number is not SPY Number");

        }

    }
}
