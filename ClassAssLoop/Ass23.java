/*Q23. Write a java program to Check Number Is Duck Number or Not.
	Example : A Duck number is a positive number which has zeroes present in it, 
	For example 3210, 8050896, 70709 are all Duck numbers.
	Please note that a number with only leading 0s is not considered a Duck Number.
	For example, numbers like 035 or 0012 are not considered as Duck Numbers.*/
	
import java.util.*;
public class Ass23{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a numnber : ");
		int num=sc.nextInt();
		int rem;
		boolean flag=false;
		while(num>0){
			rem=num%10;
			num/=10;
			if(rem==0){
				flag=true;
				break;
			}
		}
		if(flag){
			System.out.print("Number Is Duck Number");
		}else{
			System.out.print("Number Is Not Duck Number");	
		}
		
	}
}