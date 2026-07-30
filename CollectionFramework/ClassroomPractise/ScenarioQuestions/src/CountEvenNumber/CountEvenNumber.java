//Q8. Write a Java program to count how many even numbers are present in a Vector.
//Description
//Store integer values.
//Traverse using loop.
//Check number % 2 == 0.
//Count even numbers.
//Input
//Enter elements:
//10
//15
//20
//25
//30
//Output
//Total even numbers = 3

package CountEvenNumber;

import java.util.Scanner;
import java.util.Vector;

public class CountEvenNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Vector<Integer>v=new Vector<>();
		System.out.println("Enter the number of element");
		int n=sc.nextInt();
		System.out.println("Enter elements");
		for(int i=0;i<n;i++) {
			v.add(sc.nextInt());
		}
		int evenCount=0;
		int oddCount=0;
		for(int it:v) {
			if(it%2==0) {
				evenCount++;
			}else{
				oddCount++;
			}
		}
		
		System.out.println("Total even numbers = "+evenCount);
		System.out.println("Total odd numbers = "+oddCount);
	}
}




















