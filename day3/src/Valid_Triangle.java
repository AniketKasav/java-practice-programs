import java.util.Scanner;

public class Valid_Triangle {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first angle :");
        int a=sc.nextInt();
        System.out.print("Enter the second angle :");
        int b=sc.nextInt();
        System.out.print("Enter the third angle :");
        int c=sc.nextInt();

        if(a+b+c==180){
            System.out.println("Given trangle is valid");
        }else{
            System.out.println("not valid");
        }

    }
}
