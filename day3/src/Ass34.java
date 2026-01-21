import java.util.Scanner;

public class Ass34 {
    public static void main(String[] args){
//        Q34. Write a Java program to check whether
//        a number is positive, negative, or zero.

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num=sc.nextInt();
        if(num==0){
            System.out.println("The given number is zero !!!");
            return;
        }
        if(num>0){
            System.out.println("Given number is positive !!!");
        }else{
            System.out.println("Given number is negative !!!");
        }

    }
}
