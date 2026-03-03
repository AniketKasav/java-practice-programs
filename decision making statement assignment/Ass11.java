import java.util.*;
public class Ass11{
	public static void main(String[] args){
		 //Q11. Write a java program to find a maximum between three numbers.
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter first number : ");
		int a=sc.nextInt();
		System.out.print("Enter second number : ");
		int b=sc.nextInt();		
		System.out.print("Enter third number : ");
		int c=sc.nextInt();
		int max=a;
		if(b>max)max=b;
		if(c>max)max=c;
		System.out.print(max+" is Maximum ");
	

	}
}