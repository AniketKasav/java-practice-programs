import java.util.Scanner;

public class Ass2 {
//    Q2. Write a Java program to check whether a triangle is valid or not.

    public static void main(String[] args){

        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the Angles of the Triangle(space separated values) : ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c= sc.nextInt();
        if(a+b+c==180){
            System.out.println("Valid Triangle");
        }else{
            System.out.println("Triangle is not valid");
        }

    }
}
