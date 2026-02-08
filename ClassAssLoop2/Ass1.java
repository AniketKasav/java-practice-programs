//Example: WAP to input number from keyboard and search digit present in number or not?

import java.util.*;
public class Ass1{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num=sc.nextInt();
		System.out.print("Enter the search digit : ");
		int sdigit=sc.nextInt();
		int rem;
		boolean flag=false;
		while(num>0){
			rem=num%10;
			num/=10;
			if(rem==sdigit){
				flag=true;
				break;
			}
		}
		if(flag){
			System.out.print("Digit found !!");
		}else{
			System.out.print("Digit not found !!");
			
		}
		
		
	}
}