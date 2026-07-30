//Q3. Write a Java program to search a given number in a Vector.
//Description
//Store integer values in Vector.
//Accept a number to search.
//Check using loop or contains() method.
//Print found or not found.
//Input
//Enter number of elements:
//5
//
//Enter elements:
//10
//22
//35
//48
//50
//
//Enter number to search:
//35
//Output
//Element found in vector

package CheckElementFoundOrNot;
import java.util.*;
public class FindElement {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Vector<Integer>v=new Vector<>();
		System.out.println("Enter the number of element ");
		int n=sc.nextInt();
		System.out.println("Enter elements:");
		for(int i=0;i<n;i++) {
			v.add(sc.nextInt());
		}
		System.out.println("Enter number to search:");
		int ele=sc.nextInt();
		for(Object obj:v) {
			if(ele==(int)obj) {
				System.out.println("Element found in vector");
				System.exit(0);
			}
		}
		System.out.println("Element is not found in vector");

	}

}
