//Q7. Write a Java program to update an element at a specific position in a Vector.
//Description
//Store elements in Vector.
//Ask user for position.
//Accept new value.
//Update using set(index,value) method.
//Display updated Vector.
//Input
//Enter elements:
//10
//20
//30
//40
//
//Enter position to update:
//2
//
//Enter new value:
//99
//Output
//Updated Vector:
//10
//20
//99
//40

package UpdateElementAtSpecificIndex;

import java.util.Scanner;
import java.util.Vector;

public class UpdateElement {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Vector<Integer>v=new Vector<>();
		System.out.println("Enter the number of element");
		int n=sc.nextInt();
		System.out.println("Enter elements");
		for(int i=0;i<n;i++) {
			v.add(sc.nextInt());
		}
		System.out.println("Enter position to update:");
		int pos=sc.nextInt();
		System.out.println("Enter new value:");
		int nval=sc.nextInt();
		for(int i=0;i<n;i++) {
			if(i==pos) {
				v.set(i, nval);
				break;
			}
		}
		System.out.println("Updated Vector");
		System.out.println(v);
	}
}















