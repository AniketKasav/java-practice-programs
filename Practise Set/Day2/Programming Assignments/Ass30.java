//30 Copy array elements —

import java.util.Scanner;
public class Ass30{
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size of the array :  ");
		int n=sc.nextInt();
		System.out.println("Enter the array elements ");
		int []arr=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		int result[]=new int[arr.length];
		for(int i=0;i<result.length;i++){
			result[i]=arr[i];
		}
		System.out.println("Copied array elements :");
		for(int i=0;i<result.length;i++){
			System.out.print(result[i]+" ");
		}
	}
}