/*Q12. Write a program in java to insert an element at desired position from an array.
	Test Data :
	Input the size of array : 6
	Input 5 elements in the array in ascending order :
	1   2    3    4    5
	Input the position where to insert : 2
	Value :      200
	Expected Output : The new list is : 1 2 200 3 4 5             */
	
import java.util.Scanner;
public class Ass12{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int a[]=new int[6];		
		System.out.println("Input 5 elements in the array");

		
		for(int i=0;i<5;i++){
			a[i]=sc.nextInt();
		}
		
		System.out.print("Input the position where to insert(position start from 0) : ");
		int pos=sc.nextInt();
		//if(pos>5)
		System.out.print("Value : ");
		int val=sc.nextInt();
		for(int i=4;i>=pos;i--){
			a[i+1]=a[i];
		}
		a[pos]=val;
		
		System.out.print("The new list is : ");
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
		
	}
}