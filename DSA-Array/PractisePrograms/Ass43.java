/*Q43. Write a program in java to find out the maximum difference between 
any two elements such that larger element appears after the smaller number.
	Expected Output :
		The given array is : 7 9 5 6 13 2
		The elements which provide maximum difference is: 5, 13
		The Maximum difference between two elements in the array is: 8     */
		
import java.util.Scanner;
public class Ass43{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Program to find out the maximum difference between any two elements such that larger element appears after the smaller number.");
		System.out.print("Enter array size : ");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter array elements ");
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		
		int maxdiff=Integer.MIN_VALUE;
		int small=0,large=0;
		for(int i=0;i<n-1;i++){
			for(int j=i+1;j<n;j++){
				if(a[i]<a[j]){
					if(a[j]-a[i]>maxdiff){
						maxdiff=a[j]-a[i];
						small=a[i];
						large=a[j];
						
					}
				}
			}
		}
		
		System.out.print("The given array is : ");
		for(int i=0;i<n;i++){
			System.out.print(a[i]+" ");
		}
		
		System.out.println();
		System.out.println("The elements which provide maximum difference is: " + small + ", " + large);
		System.out.println("The Maximum difference between two elements in the array is:"+maxdiff);
		
	}
}