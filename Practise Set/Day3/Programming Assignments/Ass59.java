//59 Recursive decimal to binary —

import java.util.*;
public class Ass59{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number : ");
		int a=sc.nextInt();
		System.out.println("The sum of natural numbers form 1 to n : "+binary(a));
	}
	
	public static String binary(int num){
		if(num==0){
			return "0";
		}
		if(num==1){
			return "1";
		}
		return binary(num/2)+(num%2);
	}
}