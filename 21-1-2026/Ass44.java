/*Q44. The chef has to travel to another place. For this, he can avail any one of two cab services.
·        The first cab service charges XX rupees.
·        The second cab service charges YY rupees.
The chef wants to spend the minimum amount of money. Which cab service should the Chef take?
Input Format
·        The first line will contain TT - the number of test cases. Then the test cases follow.
·        The first and only line of each test case contains two integers XX and YY - the prices of first and second cab services respectively.
Output Format
For each test case, output FIRST if the first cab service is cheaper, output SECOND if the second cab service is cheaper, 
output ANY if both cab services have the same price.
You may print each character of FIRST, SECOND and ANY in uppercase or lowercase (for example, any, aNy, Any will be considered identical). 
Constraints
1<=T<=100
1<X<Y<=100
Example :
Input 	    Output
30 65     	First
42 42     	Any
90 50     	Second */

import java.util.*;
public class Ass44{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of test cases");
		int tt=sc.nextInt();
		while(tt>0){
		System.out.println("Enter the charges of first and second cab ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		if(a==b){
			System.out.println("any");
		}else if(a>b){
			System.out.println("second");
			
		}else{
			System.out.println("first");
		}
		tt--;
		}
		
	}
}
