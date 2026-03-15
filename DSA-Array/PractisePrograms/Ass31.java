/*Q31. Replace First and Last Element with 0.
Input:[5, 3, 7, 2]
Output: [0, 3, 7, 0]
Explanation:
 The first element (5) and the last element (2) are replaced with 0. Middle elements remain the same.    */
 
import java.util.Scanner;
public class Ass31{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Program for Replace First and Last Element of array with 0.");
		System.out.print("Enter the Array Size : ");
		int n=sc.nextInt();
		int a[] = new int[n];
		System.out.println("Enter the array elements ");
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		
		a[0]=0;
		a[a.length-1]=0;
		//you can also use for loop 
		
		System.out.print("Output : ");
		for(int i=0;i<n;i++){
			System.out.print(a[i]+" ");
		}
		
		
	}
}