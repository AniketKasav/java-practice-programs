import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of a :");
        int a=sc.nextInt();
        System.out.print("Enter the value of b :");
        int b=sc.nextInt();
        System.out.print("Enter the value of c :");
        int c=sc.nextInt();
        double sqrt=Math.sqrt(b*b-(4*a*c));
        double x1=(-b+sqrt)/(2*a);
        double x2=(-b-sqrt)/(2*a);
        System.out.println("the root of the given equation x1: "+x1+" and x2: "+x2);


    }
}
