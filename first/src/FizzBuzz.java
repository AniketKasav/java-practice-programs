import java.util.Scanner;

public class FizzBuzz {
    public static void main(String []args){
        // FizzBuzz logic
        // if num is divisible 5 then print Fizz
        // divisible by 3 then Buzz and if divisible by both then FizzBuzz
        // not by 5 or 3 then print that number
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num=sc.nextInt();
        if(num%5==0 && num%3==0) System.out.println("FizzBuzz");
        else if(num%3==0) System.out.println("Buzz");
        else if(num%5==0) System.out.println("Fizz");
        else System.out.println(num);
    }
}
