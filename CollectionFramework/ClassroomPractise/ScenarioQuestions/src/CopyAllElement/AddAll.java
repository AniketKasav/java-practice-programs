//Q9. Write a Java program to copy all elements from one Vector into another Vector.
//Description
//Create two Vectors.
//Store elements in first Vector.
//Copy using addAll() method.
//Display second Vector.
//Input
//Enter elements:
//5
//10
//15
//20
//Output
//Second Vector elements:
//5
//10
//15
//20

package CopyAllElement;
import java.util.Scanner;
import java.util.Vector;
public class AddAll {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Vector<Integer>v=new Vector<>();
		System.out.println("Enter the number of element ");
		int n=sc.nextInt();
		System.out.println("Enter elements:");
		for(int i=0;i<n;i++) {
			v.add(sc.nextInt());
		}
		Vector<Integer>v2=new Vector<>();
		v2.addAll(v);
		System.out.println("Second Vector elements:");
		System.out.println(v2);

	}

}
