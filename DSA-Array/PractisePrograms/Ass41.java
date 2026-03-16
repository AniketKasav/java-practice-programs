/*Q41. Write a program in java to to print next greater elements in a given unsorted array. 
Elements for which no greater element exist, consider next greater element as -1.
Expected Output :
		The given array is : 5 3 10 9 6 13
		Next Bigger Elements are:
		Next bigger element of 5 in the array is: 10
		Next bigger element of 3 in the array is: 10
		Next bigger element of 10 in the array is: 13
		Next bigger element of 9 in the array is: 13
		Next bigger element of 6 in the array is: 13
		Next bigger element of 13 in the array is: -1
		Next Bigger Elements Array:
		10 10 13 13 13 -1                                  */
		
import java.util.Scanner;
public class Ass41{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the array size : ");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the array elements ");
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		
		int biggerEelemtsArray[]=new int[n];
		int next;
		System.out.println("Next Bigger Elements are:");
		for(int i=0;i<n;i++){
			next=-1;
			for(int j=i+1;j<n;j++){
				if(a[j]>a[i]){
					next=a[j];
					break;
				}
			}
			System.out.printf("Next bigger element of %d in the array is: %d\n",a[i],next);
			biggerEelemtsArray[i]=next;
		}
		System.out.println("Next Bigger Elements Array:");
		for(int i=0;i<n;i++){
			System.out.print(biggerEelemtsArray[i]+" ");
		}
		
	}
}