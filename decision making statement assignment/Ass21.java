//Q21. Write a java program to check whether a number is neon or not.      	
  //      	Input : 9
    //    	Output : Neon Number
      //  	Explanation: square is 9*9 = 81 and
        //	The sum of the digits of the square is 9. 
		
import java.util.Scanner;

public class Ass21{
	public static void main(String[] args){
		System.out.print("Enter the Number : ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int num=n;
		int sum=0,digit;
		while(num>0){
			digit=num%10;
			sum+=digit;
			num/=10;	
		}
		System.out.println("num : "+n);
		System.out.println("sum : "+sum);
		if(n==sum){
			System.out.print("Given number is a neon number ");
		}else{
			System.out.print("Given number is not a neon number ");
			
		}
	}
}