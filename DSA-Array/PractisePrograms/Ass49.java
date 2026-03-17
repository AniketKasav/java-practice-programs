/*Q49. Write a java program to find unique value in this given array.
	Input :- array elements: 1, 2, 3, 5, 1, 5, 20, 2, 12, 10 
	Output :-  All unique elements in the array are: 3, 20, 12, 10     */
	
	
import java.util.Scanner;
public class Ass49{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the array size : ");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the array elements ");
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		
		boolean flag;
		System.out.print("All unique elements in the array are:");
		for(int i=0;i<n;i++){
			flag=true;
			if(a[i]==-1){
				continue;
			}
			for(int j=i+1;j<n;j++){
				if(a[i]==a[j]){
					flag=false;
					a[j]=-1;
				}
			}
			if(flag){
				System.out.print(a[i]+" ");	
			}
			a[i]=-1;
		}
		
	}
}