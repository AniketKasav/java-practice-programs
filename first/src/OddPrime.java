import java.util.Scanner;

public class OddPrime {
    public static void main(String[] args){
        // prime number from 1 to 100
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number (1 to N) must enter number greater than 1:");
        int n=sc.nextInt();
        for(int i=3;i<=n;i+=2){
            boolean isPrime=true;
            for(int j=3;j*j<=i;j+=2){
                if(i%j==0){
                    isPrime=false;
                    break;
                }
            }
            if(isPrime ){
                System.out.print(" "+i);
            }
        }
    }
}
