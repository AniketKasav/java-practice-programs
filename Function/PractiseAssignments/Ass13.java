/*Q13. Write a Java method that accepts a number and returns its square.
Explanation
Square means number × number
The method calculates and returns the result
Method Signature - static int square(int n)
Input - n = 5
Output - Square = 25 */


import java.util.Scanner;
public class Ass13{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number ");
		int num=sc.nextInt();
		
		int result=square(num);
		System.out.print("Result : "+result);
		
	}
	
	public static int square(int n){
		return n*n;
	}
}