/*Q30. Replace All Elements Divisible by 3 with -1.
Input: [3, 6, 7, 9, 10]
Output: [-1, -1, 7, -1, 10]
Explanation:
 Elements divisible by 3 are 3, 6, 9. These are replaced with -1. Other elements remain unchanged.    */
 
import java.util.Scanner;
public class Ass30{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Program for Replace All Elements Divisible by 3 with -1.");
		System.out.print("Enter the array size : ");
		int n=sc.nextInt();
		System.out.println("Enter the array elements : ");
		int a[]=new int[n];
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		
		for(int i=0;i<n;i++){
			if(a[i]%3==0){
				a[i]=-1;
			}
		}
		
		System.out.print("Output : ");
		for(int i=0;i<n;i++){
			System.out.print(a[i]+" ");
		}
	}
}