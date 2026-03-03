//Q37. Write a java program to find LCM of two numbers.

//lcm=(a*b)/gcd

import java.util.*;
public class Ass37{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two number : ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		//Euclidean Algorithm (refer Q.36)
		int lcm=a*b,temp;
		while(b!=0){
			temp=b;
			b=a%b;
			a=temp;
		}
		lcm=lcm/a; //(a*b/gcd)
		System.out.print("LCM = "+lcm);
	}
}