/*Q25. Move all zeros in an array to the end while maintaining the relative order of non-zero elements.
	Input :- arr = [0, 1, 0, 3, 12]
	Output :- arr = [1, 3, 12, 0, 0]
Explanation:
All non-zero elements [1, 3, 12] retain their original order.
All zeros are moved to the end of the array.   */

import java.util.Scanner;
public class Ass25{
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the array size : ");
		int n=sc.nextInt();
		System.out.println("Enter array elements : ");
		int []a=new int[n];
		for(int i=0;i<a.length;i++){
			a[i]=sc.nextInt();
		}
		int j=0;
		int temp=0;
		for(int i=0;i<a.length;i++){
			if(a[i]!=0){
				temp=a[j];
				a[j]=a[i];
				a[i]=temp;
				j++;
			}
			
		}
		
		System.out.print("Output Array : ");
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
	}
}