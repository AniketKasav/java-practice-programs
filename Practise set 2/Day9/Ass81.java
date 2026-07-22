/*81. Generate all possible strings from a set of characters.

Example:
take this input:
Characters: {A, B, C}

Generate all possible non-empty strings, where:
Different lengths are allowed.
Each character can be used at most once.
Different orders count separately.

Expected output:
A, B, C, AB, AC, BA, BC, CA, CB, ABC, ACB, BAC, BCA, CAB, CBA   */

import java.util.Scanner;
public class Ass81{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a arr size :");
		int n=sc.nextInt();
		sc.nextLine();
		char arr[]=new char[n];
		System.out.println("Enter a characters :");
		for(int i=0;i<n;i++){
			arr[i]=sc.nextLine().charAt(0);
		}
		solve(0,arr);
	}
	
	public static void solve(int idx,char arr[]){
		
		for(int i=idx;i<arr.length;i++){
			char temp=arr[idx];
			arr[idx]=arr[i];
			arr[i]=temp;
			System.out.println(new String(arr,0,idx+1));
			solve(idx+1,arr);
			temp=arr[idx];
			arr[idx]=arr[i];
			arr[i]=temp;
		}
		
	}
}