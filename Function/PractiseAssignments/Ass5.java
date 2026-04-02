/*Q5. Write a function that accepts a number and prints its multiplication table up to 10.
Explanation
Use a loop from 1 to 10
Multiply number with loop variable
Print result inside function
Example
Input: 3
Output:
3 x 1 = 3  
3 x 2 = 6  
3 x 3 = 9  
...
3 x 10 = 30     */

import java.util.Scanner;
public class Ass5{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter a number ");
		int num=sc.nextInt();
		table(num);
	}
	
	public static void table(int n){
		for(int i=1;i<=10;i++){
			System.out.printf("%d * %d = %d\n",i,n,(i*n));
		}
	}
}