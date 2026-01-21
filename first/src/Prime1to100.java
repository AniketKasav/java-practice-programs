import java.util.Scanner;

public class Prime1to100 {
    public static void main(String[] args){
        // prime number from 1 to 100
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number (1 to N) must enter number greater than 1:");
        int n=sc.nextInt();
        for(int i=2;i<=n;i++){
            boolean isPrime=true;
            for(int j=2;j*j<=i;j++){
                if(i%j==0){
                    isPrime=false;
                    break;
                }
            }
            if(isPrime){
                System.out.print(" "+i);
            }
        }
    }
}
