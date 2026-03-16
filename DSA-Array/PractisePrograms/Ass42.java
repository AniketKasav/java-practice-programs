/*Q42. Write a program in java to find a subarray with given sum from the given array?
Expected Output :
		The given array is : 3 4 -7 1 3 3 1 -4
		[0..1] -- { 3 4 }
		[0..5] -- { 3 4 -7 1 3 3 }
		[3..5] -- { 1 3 3 }
		[4..6] -- { 3 3 1 }                    */
		
		
		
import java.util.Scanner;
public class Ass42{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the array size : ");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the array elements ");
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		
		System.out.print("Enter the sum value : ");
		int sum=sc.nextInt();
		
		int start,end,subSum;
		for(int i=0;i<n;i++){
			start=i;
			subSum=0;
			for(int j=i;j<n;j++){
				subSum+=a[j];
				if(subSum==sum){
					System.out.printf("[%d..%d] -- { ",i,j);
					for(int k=i;k<=j;k++){
						System.out.print(a[k]+" ");
					}
					System.out.print("}\n");
				}
			}
		}
		
	}
}