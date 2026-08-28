/* Q10. Question Statement
Write a Java program to store two arrays into two ArrayLists and display common elements.
Description
Store both arrays
Compare elements
Input
Array1: 1 2 3 4
Array2: 3 4 5 6
Output
Common Elements: [3, 4]      */

import java.util.*;

public class Ass10{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the number of elements in arr1:");
		int n1=sc.nextInt();
		sc.nextLine();
		System.out.println("Entre numbers");
		int[] arr1=new int[n1];
		for(int i=0;i<n1;i++){
			arr1[i]=sc.nextInt();
		}
		ArrayList<Integer>ls1=new ArrayList<>();
		for(int i:arr1){
			ls1.add(i);
		}
		System.out.println("Enter the number of elements in arr2:");
		int n2=sc.nextInt();
		sc.nextLine();
		System.out.println("Entre numbers");
		int[] arr2=new int[n1];
		for(int i=0;i<n2;i++){
			arr2[i]=sc.nextInt();
		}
		ArrayList<Integer>ls2=new ArrayList<>();
		for(int i:arr2){
			ls2.add(i);
		}
		
		ArrayList<Integer>common=new ArrayList<>();
		for(int num:ls1){
			if(ls2.contains(num)){
				common.add(num);
			}
		}
		System.out.println("Common Elements :"+common);
		
	}
}