import java.util.Scanner;

public class Ass35 {
    public static void main(String[] args){
//        Q35. Write a Java program to check whether
//        a number is divisible by both 5 and 11.

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num=sc.nextInt();
        if(num%5==0 && num%11==0){
            System.out.println("Divisible by 5 and 11");
        }



    }
}
