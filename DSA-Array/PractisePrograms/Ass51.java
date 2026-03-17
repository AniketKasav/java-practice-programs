/*Q51. Write a java program to display top three value from array.
	Sample Input: [78, 90, 90, 86, 85, 92, 70, 92]
	Expected Output: 92, 90, 86                       */
	
import java.util.Scanner;
public class Ass51{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size of array : ");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the array elements ");
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		
		for(int i=0;i<n-1;i++){
			for(int j=0;j<n-1-i;j++){
				if(a[j]<a[j+1]){
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		System.out.print("Enter how many top numbers to display: ");
		int t=sc.nextInt();
		System.out.print("Output: ");
		int count=0;
		for(int i=0;i<a.length && count<t;i++){
			if(i==0 || a[i]!=a[i-1]){
				System.out.print(a[i]+" ");
				count++;
			}
		}
	}
}