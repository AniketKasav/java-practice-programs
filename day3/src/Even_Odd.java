import java.util.Scanner;

public class Even_Odd {
    public static void main(String[] args){
//        Q31. Write a Java program to check whether a given number is even or odd.
//        Input : Number = 12
//        Output : Even
//        Explanation : A number divisible by 2 is even; otherwise, it is odd.
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number :");
        int num= sc.nextInt();

        if(num%2==0){
            System.out.println("Given number is even");
        }else{
            System.out.println("Given number is odd");

        }



    }
}
