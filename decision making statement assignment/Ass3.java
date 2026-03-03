import java.util.Scanner;

public class Ass3 {
//    Q3. Write a Java program to check whether a triangle is equilateral , isosceles  or scalene.
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the angles of the triangle : ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(a+b+c!=180){
            System.out.println("Triangle is not valid");
            return;}

        if(a==b && a==c){
            System.out.println("equilateral triangle");
        }
        else if(a==b || b==c || a==c){
            System.out.println("isosceles triangle");
        }else{
            System.out.println("scalene triangle");
        }

    }
}

