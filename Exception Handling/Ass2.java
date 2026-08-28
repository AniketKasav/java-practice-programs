/*Question 2: Write a Java program to handle ArrayIndexOutOfBoundsException while accessing array elements.

Create an integer array of fixed size and allow the user to enter an index number.
 If the index is beyond array size, handle the exception properly.
Asked In Practice Assignment
Input:
Enter array size: 5
Enter index to access: 7

Output:
Exception occurred: Index is out of range

Explanation:
ArrayIndexOutOfBoundsException occurs when accessing array index that does not exist. 
If user enters index 7 but array size is 5 (valid indices 0-4), exception is thrown. 
Catch this exception and display user-friendly message about valid range.                    */

import java.util.Scanner; 
public class Ass2{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int[] arr=new int[]{4,5,6,8,7};
		System.out.println("Enter the array index ");
		int idx=sc.nextInt();
		try{
			int result=arr[idx];
			System.out.println("Value at index is "+result);
		}
		catch(ArrayIndexOutOfBoundsException ex){
			System.out.println("array size is 5 (valid indices 0-4)");
		}
		
	}
}