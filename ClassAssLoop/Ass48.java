/*Q48. Task: Take an integer n and an integer k. Rotate the number n by k places to the left without using arrays or strings.
Example: n = 123456, k = 2 → output 345612.
Hint: Use modulus and division to split and rearrange digits.
Q48. Task: Take an integer n and an integer k. Rotate the number n by k places to the left without using arrays or strings.
Example: n = 123456, k = 2 → output 345612.
Hint: Use modulus and division to split and rearrange digits. */

import java.util.Scanner;
public class Ass48{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num=sc.nextInt();
		System.out.print("Enter a value of k : ");
		int k=sc.nextInt();
		int temp=num;
		int count=0;
		while(temp>0){
			temp/=10;
			count++;
		}
		k=k%count;
		int p=(int)Math.pow(10,count-k);
		int p1=(int)Math.pow(10,k);
		int h1=num%p;
		int h2=num/p;
		int h3=h1*p1+h2;
		System.out.print(h3);
		
	}
	
}

