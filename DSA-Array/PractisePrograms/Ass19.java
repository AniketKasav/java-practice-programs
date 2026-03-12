/*Q19. Given an integer array, replace all the negative numbers in the array with 0 and print the updated array.
Explanation
Traverse the array from the first element to the last.
Check each element:
If the element is negative, replace it with 0.
If the element is zero or positive, keep it as it is.
After completing the traversal, print the modified array.
Input :- Array = [5, -3, 7, -1, 0, -6, 4]
Output :- Updated Array = [5, 0, 7, 0, 0, 0, 4]                    */

import java.util.Scanner;
public class Ass19{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size of an array : ");
		int n=sc.nextInt();
		System.out.println("Enter the array elements !!");
		int a[]=new int[n];
		for(int i=0;i<a.length;i++){
			a[i]=sc.nextInt();
		}
		
		//Updated Array
		
		for(int i=0;i<a.length;i++){
			if(a[i]<0){
				a[i]=0;
			}
		}
		System.out.print("Updated Array = ");
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
		
	}
}