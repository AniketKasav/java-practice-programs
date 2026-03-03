import java.util.Scanner;

public class CubeOfNumber {
    public static void main(){
//        Q19. Write a Java program that reads a number and displays its cube.
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number :");
        int num= sc.nextInt();
        int sqr=num*num*num;
//        double sqr1=Math.pow(num,3);
        System.out.println("The sqr of the number is "+sqr);
    }
}
