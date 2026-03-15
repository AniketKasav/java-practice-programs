/*Q24. Write a program in java to rotate an array by N positions ?
Expected Output:
	The given array is: 0  3  6  9  12  14  18  20  22  25  27
	From 4th position the values of the array are: 12 14 18 20 22 25 27 
	Before 4th position the values of the array are: 0  3  6  9 
	After rotating from 4th position the array is: 12 14 18 20 22 25 27 0 3  6 9   */

import java.util.Scanner;
public class Ass24{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the array size : ");
		int n=sc.nextInt();
		System.out.println("Enter array elements : ");
		int []a=new int[n];
		for(int i=0;i<a.length;i++){
			a[i]=sc.nextInt();
		}
		
		System.out.print("Enter the position : ");
		int pos=sc.nextInt();
		if(position > n) {
            System.out.println("Rotation not possible because position is greater than array size");
        }
		int temp=0;
		for(int i=0;i<pos;i++){
			temp=a[i];
			for(int j=0;j<a.length-1;j++){
				a[j]=a[j+1];
			}
			a[n-1]=temp;
		}
		
		//optimal solution reverse array 
		// form 0 to pos-1 then from pos to n-1 and then whole arrray i.e. is  0 to n-1
		
		
		System.out.printf("After rotating from %dth position the array is:",pos);
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
	}
}