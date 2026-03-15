/*Q39. Write a program in java to find the smallest missing element from a sorted array?
		Expected Output :
		The given array is : 0 1 3 4 5 6 7 9
		The missing smallest element is: 2      */
		
import java.util.Scanner;
public class Ass39{
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Program to to find the smallest missing element from a sorted array(asending order)");
		System.out.print("Enter the array size : ");
		int n=sc.nextInt();
		System.out.println("Enter array elements  : ");
		int []a=new int[n];
		for(int i=0;i<a.length;i++){
			a[i]=sc.nextInt();
		}
		
		if(a[0] != 0){
            System.out.println("The missing smallest element is: 0");
            return;
        }
		
		for(int i=0;i<n-1;i++){
			if(a[i]+1!=a[i+1]){
				System.out.print("The missing smallest element is:"+(a[i]+1));
				return;
			}
		}
		
		System.out.print("There is no missing element");
	}
}