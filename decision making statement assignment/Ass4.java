import java.util.Scanner;

public class Ass4 {
//    Q4. Write a Java program to check whether a number is positive , negative or zero.

    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num=sc.nextInt();
        if(num==0){
            System.out.println("Given number is zero");
        }else if(num>0){
            System.out.println("Given number is positive");

        }else{

            System.out.println("Given number is negative");
        }



    }
}

