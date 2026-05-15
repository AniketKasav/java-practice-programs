//47 Function to find LCM —
// lcm=(a*b)/gcd(a,b);
// lcm=(a/gcd(a,b))*b   to avoid the outofbound exception

import java.util.*;
public class Ass47{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two number : ");
		int a=sc.nextInt();
		//System.out.println("Enter a second number : ");
		int b=sc.nextInt();
		// first calculate the gcd 
		// trick a=b and then b=a%b upto b!=0 when b become zero the a will be the gcd
		// ie a=5 and b=2   then a=2 b=1 then a=1 b=0 then ans is 1
		//gcd(a,b)---> gcd(b,a%b)
		// find the min and max between them
		int min=0;
		int max=0;
		if(a<b){
			min=a;
			max=b;
		}else{
			min=b;
			max=a;
		}
		while(min!=0){
			int temp=min;
			min=max%min;
			max=temp;
			
		}
		System.out.println("The gcd is : "+max);	
		
		// now calculate the lcm
		int lcm=(a/max)*b;
		System.out.println("The lcm is : "+lcm);
		
	}	
}