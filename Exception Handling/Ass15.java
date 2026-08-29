/*Question 15: Write a Java program to handle exceptions while reading array elements.

Accept array size and elements. Handle exceptions if the user enters invalid datatype.
Asked In Practice Assignment
Input:
Enter size: 3
Enter elements: 10 A 30

Output:
Invalid input for array element

Explanation:
When reading array elements, NumberFormatException or InputMismatchException can occur 
if user enters non-numeric data. When user enters "A" instead of number, exception is caught 
and message informs about invalid input type expected.*/

import java.util.*;
public class Ass15{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
			System.out.println("Enter the array size");
			int n=sc.nextInt();
			int[] arr=new int[n];
			System.out.println("Enter the array elements ");
			try{
				for(int i=0;i<n;i++){
					arr[i]=sc.nextInt();
				}
			}
			catch(InputMismatchException e){
				System.out.println("Invalid input for array element");
			}
	}
}