/*Q36. Compare two numbers: greater, smaller, or equal.
 
    Input: Two integers
    Logic: if-else if
    Output: Greater, smaller, or equal.  */

import java.util.*;

public class Ass36{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the two number : ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		if(a==b){
			System.out.print("both numbers are equal");
		}else if(a>b){
			System.out.printf("%d is greater than %d",a,b);
		}else{
			System.out.printf("%d is smaller than %d",a,b);
			
		}
		
		
	}
}	