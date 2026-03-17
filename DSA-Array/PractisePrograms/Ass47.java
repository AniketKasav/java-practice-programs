/*Q47. Write a java program to merge of two given array.
		Input :- First Array :- 1 2 3 4 5	
             	 Second Array :-  6 7 8 9 10 
				 Output :- 1 2 3 4 5 6 7 8 9 10     */
				 
import java.util.Scanner;
public class Ass47{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("{Program in java to to merge of two given array.");
		System.out.print("Enter the array1 size : ");
		int n1=sc.nextInt();
		System.out.println("Enter the array1 elements ");
		int a[]=new int[n1];
		for(int i=0;i<n1;i++){
			a[i]=sc.nextInt();
		}
		System.out.print("Enter the array2 size : ");
		int n2=sc.nextInt();
		System.out.println("Enter the array2 elements ");
		int b[]=new int[n2];
		for(int i=0;i<n2;i++){
			b[i]=sc.nextInt();
		}
		
		int mergeArray[]=new int[n1+n2];
		int k=0;
		for(int i=0;i<n1;i++){
			mergeArray[k]=a[i];
			k++;
		}
		for(int i=0;i<n2;i++){
			mergeArray[k]=b[i];
			k++;
		}
		
		System.out.print("Output : ");
		for(int i=0;i<mergeArray.length;i++){
			System.out.print(mergeArray[i]+" ");
		}
		
	}
}