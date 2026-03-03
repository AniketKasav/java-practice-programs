import java.util.Scanner;

public class Ass1 {
//    Q1. Write a Java program to check whether a number is even or odd.
    public static void main(String[] args){

     Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number : ");
     int num=sc.nextInt();
     if(num%2==0){
         System.out.println("Given number is even !!");
     }
     else{
         System.out.println("Given number is odd !!");

     }
    }
}

