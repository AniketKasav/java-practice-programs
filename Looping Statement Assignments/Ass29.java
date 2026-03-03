//Q29. Write a java program to display 1 to nth Prime Number.

import java.util.*;
public class Ass29{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num=sc.nextInt();
		int flag;
		for(int n=2;n<=num;n++){
			flag=1;
			for(int j=2;j*j<=n;j++){
				if(n%j==0){
					flag=0;
					break;
				}
			}
			if(flag==1){
				System.out.print(n+" "); 
			}
			
		}
		
		
	}
}
