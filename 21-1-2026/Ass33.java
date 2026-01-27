/*Q33. There is a JAR full of candies for sale at a mall counter. JAR has the capacity N, 
that is JAR can contain maximum N candies when JAR is full. At any point of time. 
JAR can have M number of Candies where M<=N. Candies are served to the customers. 
JAR never remains empty as when the last k candies are left. JAR is refilled with new candies in such a way that JAR gets full.
Write a code to implement the above scenario. Display JAR at the counter with the available number of candies. 
Input should be the number of candies one customer can order at a point of time. Update the JAR after each purchase and display JAR at Counter.
Output should give the number of Candies sold and the updated number of Candies in JAR. 
If Input is more than candies in JAR, return: “INVALID INPUT”.
Given,
N=10, where N is NUMBER OF CANDIES AVAILABLE
K =< 5, where k is the number of minimum candies that must be inside JAR ever.
Example 1:  	(N = 10, k =< 5)
• Input Value - 3
• Output Value - NUMBER OF CANDIES SOLD : 3
-  NUMBER OF CANDIES AVAILABLE : 7
Example :    	(N=10, k<=5)
• Input Value - 0
• Output Value - INVALID INPUT
-     NUMBER OF CANDIES LEFT : 10*/

import java.util.Scanner;

public class Ass33{
	public static void main(String[] args){
		int N=10;
		int k=5;
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the no of Candies you want to buy : ");
		int c=sc.nextInt();
		
		if(c>N || c<=0){
			System.out.println("INVALID INPUT");
			System.out.println("NUMBER OF CANDIES LEFT : "+N);
			return;
		}
		
		N=N-c;
		
		if(N<=k){
			N=10;
		}
		System.out.println("NUMBER OF CANDIES SOLD : "+c);
		System.out.println("NUMBER OF CANDIES AVAILABLE : "+N);
		
	}
}