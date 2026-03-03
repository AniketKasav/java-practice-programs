import java.util.Scanner;

public class Ass33 {
    public static void main(String[] args){
//        Q33. Write a Java program to check whether a triangle
//        is equilateral=all side equal, isosceles=2 side equal, or scalene=all side different.

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first side of triangle :");
        int a=sc.nextInt();
        System.out.print("Enter the second side of triangle :");
        int b=sc.nextInt();
        System.out.print("Enter the third side of triangle :");
        int c=sc.nextInt();
        if(a==b && b==c){
            System.out.println("The given triangle is equilateral !!!");
        }else if(a==b || a==c){
            System.out.println("The given triangle is isosceles !!!");
        }else{
            System.out.println("The given triangle is scalene !!!");
        }

    }
}
