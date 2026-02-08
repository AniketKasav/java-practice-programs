/* Q42. Write a Java program to check whether a given number is a Kaprekar number or not, and to display all Kaprekar numbers up to n.
A Kaprekar number is a non-negative integer, the representation of whose square can be split into two parts that add up to the original number itself.
 For example:
9² = 81 → split as 8 and 1 → 8 + 1 = 9
45² = 2025 → split as 20 and 25 → 20 + 25 = 45   
297² = 88209  88 | 209   88 + 209 = 297 a Kaprekar number.
here, split the square such that the right part has the same number of digits as the original number. */


import java.util.Scanner;
public class Ass42{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number to display all Kaprekar numbers up to n : ");
		int num=sc.nextInt();
		
		int temp,count,c1,h1,h2,p;
		for(int i=1;i<=num;i++){
			temp=i;
			count=0;
			while(temp>0){
				temp/=10;
				count++;
			}
			temp=i*i;    
			p=(int)Math.pow(10,count);
			h1=temp%p;
			h2=temp/p;
			
			if(h1+h2==i){
				//System.out.print(h1+"|"+h2+" = ");
				System.out.println(i+" ");
			}
			
		}
	}
}