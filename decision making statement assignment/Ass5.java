import java.util.Scanner;

public class Ass5 {
//    Q5. Write a Java program to check whether a number is divisible by 5 and 11 or not.

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num=sc.nextInt();
        if(num%5==0){
            if(num%11==0){
                System.out.println("Given number is divided by 5 and 11");
            }else{
                System.out.println("The given number is only divided by 5");
            }
        }else if(num%11==0){
            System.out.println("Given number is only divided by 11");
        }else{
            System.out.println("the given number is neither divided by 5 nor 11");
        }


    sc.close();
    }
}

