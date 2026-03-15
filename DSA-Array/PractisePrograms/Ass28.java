/*Q28. Write a java program to find the union array of two unsorted arrays.
	Input :-  arr1 = [1, 2, 3]  
   arr2 = [2, 3, 4, 5]
	Output :- [1, 2, 3, 4, 5]

Explanation:
Union combines all elements from both arrays.
Duplicates are removed to keep only unique            */

import java.util.Scanner;
public class Ass28{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		System.out.print("size of Array1 : ");
		int n1=sc.nextInt();
		int []a=new int[n1];
		System.out.println("Enter the elements of Array1 ");
		for(int i=0;i<n1;i++){
			a[i]=sc.nextInt();
		}
		System.out.print("size of Array2 : ");
		int n2=sc.nextInt();
		int []b=new int[n2];
		System.out.println("Enter the elements of Array2 ");
		for(int i=0;i<n2;i++){
			b[i]=sc.nextInt();
		}
		
		int result[]=new int[n1+n2];
		int k=0,temp;
		boolean flag;
		for(int i=0;i<a.length;i++){
			temp=a[i];
			flag=false;
			for(int j=0;j<k;j++){
				if(result[j]==temp){
					flag=true;
					break;
				}
			}
			if(!flag){
				result[k]=temp;
				k++;
			}
		}
		for(int i=0;i<b.length;i++){
			temp=b[i];
			flag=false;
			for(int j=0;j<k;j++){
				if(result[j]==temp){
					flag=true;
					break;
				}
			}
			if(!flag){
				result[k]=temp;
				k++;
			}
		}
		System.out.print("Union of array1 and array2 : ");
		for(int i=0;i<k;i++){
			System.out.print(result[i]+" ");
		}
	}
}
