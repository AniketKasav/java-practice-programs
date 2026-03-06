/*Q16.Write a Java program to calculate the average of all elements present in an integer array.
Explanation
The average of array elements is calculated by:
 Average=Sum of all elementsNumber of elements\text{Average} = \frac{\text{Sum of all elements}}{\text{Number of elements}}Average=Number of elementsSum of all elements​
First, iterate through the array and add all elements to a variable sum.
Then divide sum by the total number of elements (array.length) to get the average.
Input Array:
 [10, 20, 30, 40, 50]
Output:
 Average of array elements = 30        */
 
 
import java.util.Scanner;
public class Ass16{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size of array : ");
		int n=sc.nextInt();
		
		System.out.println("Enter the array elements ");
		int a[]=new int[n];
		float sum=0f;
		for(int i=0;i<a.length;i++){
			a[i]=sc.nextInt();
			sum+=a[i];
		}
		
		System.out.print("Average of array elements = "+sum/a.length);
	}
}
