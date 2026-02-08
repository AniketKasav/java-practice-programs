/*Q2. Example: WAP to input number and check number is palindrome or not 
    Input: 12321
    Output: Number is palindrome*/
	
import java.util.*;
public class Ass2{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num=sc.nextInt();
		int temp=num;
		int rem,rnum=0;
		while(temp>0){
			rem=temp%10;
			temp/=10;
			rnum=rnum*10+rem;
		}
		if(rnum==num){
			System.out.print("Number is palindrome !!");
		}else{
			System.out.print("Number is not palindrome !!");		
		}
		
		
	}
}