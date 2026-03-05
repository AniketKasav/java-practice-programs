/*Q10. Write a program in java to delete an element at desired position from an array.
	Test Data :
	Input the size of array : 5
	Input 5 elements in the array in ascending order :
	1   2    3    4    5
	Input the position where to delete : 3
	Expected Output : The new list is : 1 2 3 5          */
	
import java.util.Scanner;
public class Ass10{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size of array : ");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the element of the array ");
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
			
		System.out.print("Input the position where to delete : ");
		int pos=sc.nextInt();
		if(pos<0 || pos>a.length){
			System.out.print("Position is not valid !!");
		}
		//delete element 
		for(int i=pos;i<a.length-1;i++){
			a[i]=a[i+1];
		}
		
		//display new list 
		System.out.print("The new list is : ");
		for(int i=0;i<a.length-1;i++){
			System.out.print(a[i]+" ");
		}
	}
}