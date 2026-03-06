/*Q15. Write a java program to find common elements between two arrays.
Input :
 Array1 = {1, 2, 3, 4, 5}
 Array2 = {3, 4, 5, 6, 7}
Output : Common elements = {3, 4, 5}
Explanation :
Compare each element of Array1 with all elements of Array2, if match found → it is a common element.   */

import java.util.Scanner;
public class Ass15{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size of array1 : ");
		int n1=sc.nextInt();
		int a[]=new int[n1];
		System.out.println("Enter the elements of array1 !!");
		for(int i=0;i<a.length;i++){
			a[i]=sc.nextInt();
		}
		
		System.out.print("Enter the size of array2 : ");
		int n2=sc.nextInt();
		int b[]=new int[n2];
		System.out.println("Enter the elements of array2 ");
		for(int i=0;i<b.length;i++){
			b[i]=sc.nextInt();
		}
		
		int m=(a.length<b.length)?a.length:b.length;
		int result[]=new int[m];
		int c=0;
		for(int i=0;i<a.length;i++){
			for(int j=0;j<b.length;j++){
				if(a[i]==b[j]){
					
					boolean flag=false;
					for(int k=0;k<c;k++){
					if(a[i]==result[k]){
						flag=true;
					}
					}
					if(!flag){
						result[c]=a[i];
						c++;
					}
					
				}
			}
		}
		
		//print the common elements 
		System.out.print("Common elements =");
		for(int i=0;i<c;i++){
			System.out.print(result[i]+" ");
		}
		
	}
}
