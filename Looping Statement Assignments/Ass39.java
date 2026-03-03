//Q39. Write a Java program to check whether a given number is a Harshad number
//(i.e., divisible by the sum of its digits) for numbers from 1 to n.
//e.g. 18  1+8=9  18/9=2  18%9==0

import java.util.*;
public class Ass39{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number to check Harshad numbers from 1 to n: ");
		int num = sc.nextInt();
		for(int i=1;i<=num;i++){
		int temp=i,sum=0;
		while(temp>0){
			sum+=temp%10;
			temp/=10;
		}
		if(i%sum==0){
			System.out.print(i+" ");
		}
		}
	}
}
