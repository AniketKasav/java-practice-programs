import java.util.Scanner;

public class NeonNumber {
    public static void main(String[] args){
//        Q24. Write a Java program to check whether a number is a Neon number or not.
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number :");
        int num=sc.nextInt();
        int n=num*num;
        int sum=0;
        while(n>0){
            int digit=n%10;
            sum+=digit;
            n/=10;
        }
        if(num==sum){
            System.out.println("Given number is neon number");
        }else{
            System.out.println("Given number is not neon number");

        }


    }
}
