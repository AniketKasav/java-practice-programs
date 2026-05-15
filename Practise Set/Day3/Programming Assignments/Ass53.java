//53 Recursive sum of natural numbers —

import java.util.*;
public class Ass53{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number : ");
		int a=sc.nextInt();
		System.out.println("The sum of natural numbers form 1 to n : "+sum(a));
	}
	
	public static int sum(int n){
		if(n==0){
			return 0;
		}
		return n+sum(n-1);
	}
}