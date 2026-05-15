//42 Function to swap two numbers —

import java.util.*;
public class Ass42{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a first number : ");
		int a=sc.nextInt();
		System.out.println("Enter a second number : ");
		int b=sc.nextInt();
		System.out.printf("Number before swapping a=%d  and b=%d\n",a,b);
		swap(a,b);
		
	}
	
	public static void swap(int a,int b){
		int temp=a;
		a=b;
		b=temp;
		System.out.printf("Number after swapping a=%d  and b=%d\n",a,b);
	}
}