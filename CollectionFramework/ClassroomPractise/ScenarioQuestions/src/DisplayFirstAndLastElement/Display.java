//Q6. Write a Java program to store integer elements in a Vector and display the first and last element.
//Description
//Create a Vector.
//Store elements using add() method.
//Use firstElement() and lastElement() methods.
//Print both values.
//Input
//Enter number of elements:
//5
//
//Enter elements:
//11
//22
//33
//44
//55
//Output
//First element = 11
//Last element = 55

package DisplayFirstAndLastElement;

import java.util.Scanner;
import java.util.Vector;

public class Display {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of element");
		int n=sc.nextInt();
		System.out.println("Enter elements");
		Vector<Integer>v=new Vector<>();
		for(int i=0;i<n;i++) {
			v.add(sc.nextInt());
		}
		System.out.println("First element ="+v.get(0));
		System.out.println("Last element ="+v.get(v.size()-1));
	}
}





















