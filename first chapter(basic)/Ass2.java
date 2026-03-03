import java.util.Scanner;

public class Ass2 {
    public static void main(String[] aegs){
//        Q2. Write a Java program to input all basic data types (int, float, double, char, boolean)
//        and print their values.
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        float b=sc.nextFloat();
        double c=sc.nextDouble();
        char d=sc.next().charAt(0);
        boolean e =true;
        System.out.println("This is the integer:"+ a);
        System.out.println("This is the Float:"+ b);
        System.out.println("This is the Double:"+ c);
        System.out.println("This is the Char :"+d);
        System.out.println("This is the boolean: "+e);




    }
}
