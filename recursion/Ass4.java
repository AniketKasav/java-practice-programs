/*Q4. Write a recursive function to count how many digits are present in a given number.
Explanation:
Remove the last digit using division (number / 10).
Increase count in each recursive call.
Stop when the number becomes 0.
Example: Input: 4567	 Output: 4                            */

import java.util.Scanner;
public class Ass4{
	static int count=0;
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number : ");
		int n=sc.nextInt();
		Count(n);
		System.out.printf("The number of digit in %d : %d",n,count);
	}
	
	public static void Count(int n){
		if(n==0){
			return;
		}
		count=count+1;
		Count(n/10);
	}
	
}