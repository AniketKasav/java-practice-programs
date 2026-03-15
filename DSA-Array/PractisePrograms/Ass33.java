/*Q33. Check whether the given array is a palindrome.
Input: {1, 2, 3, 2, 1}
Output: true
Explanation:
 A palindrome reads the same forward and backward.
 Forward: 1 2 3 2 1
 Backward: 1 2 3 2 1
 Since both are the same, the array is a palindrome.       */
 
import java.util.Scanner;
public class Ass33{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Program to Check whether the given array is a palindrome.");
		System.out.print("Enter the array size : ");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the array elements ");
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		
		// here we use two pointer approach
		int j=a.length-1,i=0;
		boolean flag=true;
		while(i<j){
			if(a[i]!=a[j]){
				flag=false;
				break;
			}
			i++;
			j--;
		}
		if(flag){
			System.out.print("Given array is plalindrome");
		}else{
			System.out.print("Given array is not plalindrome");
		}
		
	}
}