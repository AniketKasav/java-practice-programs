//35 Print odd index elements —

import java.util.Scanner;
public class Ass35{
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size of the array :  ");
		int n=sc.nextInt();
		System.out.println("Enter the array elements ");
		int []arr=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		System.out.println("Print odd index elements  : ");
		for(int i=1;i<n;i+=2){
			System.out.print(arr[i]+" ");
		}
	}
}