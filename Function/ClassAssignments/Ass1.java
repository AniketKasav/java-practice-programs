/*Example: WAP to input number and reverse it using a recursion 
Input: 1234
Output: 4321    */

import java.util.Scanner;
public class Ass1{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num=sc.nextInt();
		int result=reverse(num,0);
		System.out.println("Result : "+result);
	}
	
	public static int reverse(int num,int r){
		if(num!=0){
			int rem=num%10;
			num/=10;
			r=r*10+rem;
			return reverse(num,r);
		}
		return r;
	}
}