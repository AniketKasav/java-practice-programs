//Q26. Write a java program to Check Number Is Neon Number or Not.
//Example : A neon number is a number where the sum of digits of the square of the number is equal to the number.
//For instance, 9 is a neon number because (9^{2}=81), and the sum of its digits ((8+1)) equals (9).
//There are only three neon numbers, which are 0,1, and 9. 

import java.util.*;
public class Ass26{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a numnber : ");
		int num=sc.nextInt();
		int sqr=num*num,sum=0,temp=num;
		while(sqr>0){
			sum+=sqr%10;
			sqr/=10;
		}
		if(temp==sum){
			System.out.print("Given number is neon number !!");
		}else{
			System.out.print("Given number is not neon number !!");		
		}
	}
}

