import java.util.Scanner;

public class Ass8 {
    public static void main(String[] args){
//        Q9. Write a Java program to enter two angles of a triangle and find the third angle.
//        Input:
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first angle:");
        int a=sc.nextInt();
        System.out.print("Enter the first angle:");
        int b=sc.nextInt();
        int c=180-a-b;
        System.out.println("Third angle :"+c);

    }
}
