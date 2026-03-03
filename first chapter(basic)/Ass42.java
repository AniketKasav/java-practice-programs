import java.util.Scanner;

public class Ass42 {
    public static void main(String[] args){
//        Q42. Write a Java program to check whether a person is
//        eligible to vote.
//                Input : Age = 19
//        Output : Eligible to Vote
//        Explanation : Minimum voting age is 18 years.
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your age :");
        int age=sc.nextInt();
        if(age>=18){
            System.out.println("your are eligible to vote !!!");
        }else{
            System.out.println("your are not eligible to vote !!!");
        }

    }
}
