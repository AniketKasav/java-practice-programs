//Q1.Example: WAP to create function name as getMax(int arr[]): this function accepts 5
//elements in array as parameter and finds the max value and returns it.

import java.util.Scanner;
public class Ass1{
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a 5 number ");
		int []arr=new int[5];
		for(int i=0;i<5;i++){
			arr[i]=sc.nextInt();
		}
		int result=getMax(arr);
		System.out.print("MAximum Number is : "+result);
	}
	public static int getMax(int arr[]){
		int max=arr[0];
		for(int i=1;i<arr.length;i++){
			if(arr[i]>max)max=arr[i];
		}
		return max;
	}
}