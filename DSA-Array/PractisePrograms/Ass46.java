/*Q46.Write a program in java to find the maximum for each and every contigious subarray of size k from a given array.
Expected Output:
		The given array is:
		1 3 6 21 4 9 12 3 16 10
		The length of each subarray is: 4
		The contagious subarray of length 4 and their maximum value are:
		1 3 6 21 ----> 21
		3 6 21 4 ----> 21
		6 21 4 9 ----> 21
		21 4 9 12 ----> 21
		4 9 12 3 ----> 12
		9 12 3 16 ----> 16
		12 3 16 10 ----> 16         */
		
import java.util.Scanner;
public class Ass46{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("{Program in java to find the maximum for each and every contigious subarray of size k from a given array.");
		System.out.print("Enter the array size : ");
		int n=sc.nextInt();
		System.out.println("Enter the array elements ");
		int a[]=new int[n];
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		System.out.print("Enter the length of each subarray : ");
		int s=sc.nextInt();
		int max=0;
		System.out.printf("The contagious subarray of length %d and their maximum value are:\n",s);
		for(int i=0;i<=n-s;i++){
			max=a[i];
			for(int j=i;j<i+s;j++){
				if(a[j]>max){
					max=a[j];
				}
				System.out.print(a[j]+" ");
			}
			System.out.print("----> "+max);
			System.out.println();
		}
	}
}