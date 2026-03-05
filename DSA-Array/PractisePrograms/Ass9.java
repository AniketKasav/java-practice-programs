/*Q9. Write a java program to copy one array to another array.
Input : Array1 = {5, 10, 15, 20}
Output : Array2 = {5, 10, 15, 20}
Explanation:
Copy each element of Array1 into Array2 using index-by-index assignment.     */


import java.util.Scanner;
public class Ass9{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size of array : ");
		int n=sc.nextInt();
		System.out.println("Enter the elements of the array ");
		int a[]=new int[n];
		
		for(int i=0;i<a.length;i++){
			a[i]=sc.nextInt();
		}
		System.out.print("Array1 = ");
		for(int i=0;i<n;i++){
			System.out.print(a[i]+" ");
		}
		int b[]=new int[n];
		for(int i=0;i<n;i++){
			b[i]=a[i];	
		}
		System.out.print("\nArray2 = ");
		for(int i=0;i<n;i++){
			System.out.print(b[i]+" ");
		}
		
	}
}
