/*Q44.Write a program in java to find two elements whose sum is closest to zero.
Expected Output :
		The given array is : 38 44 63 -51 -35 19 84 -69 4 -46
		The Pair of elements whose sum is minimum are: [44, -46]   */
		
		
import java.util.Scanner;
public class Ass44{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the array size : ");
		int n=sc.nextInt();
		int a[] = new int[n];
		System.out.println("Enter the array elements ");
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		
		int minSum=Integer.MAX_VALUE;
		int num1=0,num2=0;
		for(int i=0;i<n;i++){
			
			for(int j=i+1;j<n;j++){
				if(Math.abs(a[i]+a[j])<Math.abs(minSum)){
					minSum=a[i]+a[j];
					num1=a[i];
					num2=a[j];
				}
			}
		}
		
		System.out.printf("The Pair of elements whose sum is minimum are:[%d, %d]",num1,num2);
		
	}
}