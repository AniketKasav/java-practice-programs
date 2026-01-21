import java.util.Scanner;

public class Prime {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the Number to check Prime Number :");
        int num = sc.nextInt();
        if(num<=1){
            System.out.println("the Given number is not prime");
            return;
        }
        boolean flag=true;
        for(int i=2;i*i<=num;i++){     // i<=num/2
             if(num%i==0){
                flag=false;
                break;
            }
        }
        if(flag){
            System.out.println("The given number is prime");
        }else{
            System.out.println("the Given number is not prime");
        }


    }
}
