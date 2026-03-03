//Q24. Write a java program to Check Number Is Strong Number or Not.
//	Example : A strong number is one in which the factorial of the digits equals the number itself. 1, 2, 145,
//	 such as 1, 2, 145 (1!+4!+5! = 1+24+120 = 145), and 40585 (4!+0!+5!+8!+5! = 40585).

import java.util.*;
public class Ass24{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a numnber : ");
		int num=sc.nextInt();
		int temp=num;
		int rem,pro;
		int sum=0;
		while(num>0){
			rem=num%10;
			num/=10;
			pro=1;
			for(int i=2;i<=rem;i++){
				pro*=i;
			}
			sum+=pro;
		}
		if(temp==sum){
			System.out.print("Number Is Strong Number");
	}else{
			System.out.print("Number Is Not Strong Number");
		
	}
		
	}
}
