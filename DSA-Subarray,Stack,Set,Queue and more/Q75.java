/*Question 75: Check Prime Number
Description:
Check whether a given number is prime or not.
A prime number is divisible only by 1 and itself.
Input:
n = 29

Output:
29 is a Prime Number

Explanation:
We check divisibility from 2 up to ?n.

If any number divides n ? Not prime.
If none divides ? Prime.

For n = 29
We check up to ?29 ? 5.

Time Complexity: O(?n)
Because loop runs from 2 to square root of n. */

import java.util.*;
class Q75{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number size : ");
		int n=sc.nextInt();
		boolean flag=true;
		if(n<=1){
			flag=false;
		}
		for(int i=2;i*i<=n;i++){
			if(n%i==0){
				flag=false;
			}
		}
		if(flag){
			System.out.print("Given number is prime");
		}else{
			System.out.print("Given number is not prime");
		}
	}
}