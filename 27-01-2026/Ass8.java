//Example: WAP to input number and calculate its factorial?
// 4!=4*3*2*1

import java.util.*;
public class Ass8{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number to print factorial : ");
		int num=sc.nextInt();
		int fact=1;
		for(int i=1;i<=num;i++){
			fact=fact*i;
		}
		System.out.printf("Factorial of %d is %d",num,fact);
	}
}