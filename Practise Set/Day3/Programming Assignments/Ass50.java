//50 Function returning largest of three numbers —

import java.util.*;
public class Ass50{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter three number : ");
		int a=sc.nextInt();
		//System.out.println("Enter a second number : ");
		int b=sc.nextInt();
		int c=sc.nextInt();
		int largest=max(a,b,c);
		System.out.println("The largest number : "+largest);
	}
	
	public static int max(int a,int b,int c){
		int large=a;
		if(a<b){
			large=b;
		}
		if(a<c){
			large=c;
		}
		return large;
	}
}