/*Q28. Write a java program to Check Number Is Spy Number or Not.
Example : A number is said to be a Spy number if the sum of all the digits is equal to the product of all digits.
 	Input : 1412
	Output : Spy Number
	Explanation :
	sum = (1 + 4 + 1 + 2) = 8
	product = (1 * 4 * 1 * 2) = 8
	since, sum == product == 8      */
	
import java.util.*;
public class Ass28{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a numnber : ");
		int num=sc.nextInt();
		int rem,sum=0,pro=1,temp=num;
		while(num>0){
			rem=num%10;
			sum+=rem;
			p*=rem;
			num/=10;
		}
		if(temp==sum && temp==pro){
			System.out.print("Given number is Spy !!");
		}else{
			System.out.print("Given number is not Spy !!");
			
		}
		
	}
}