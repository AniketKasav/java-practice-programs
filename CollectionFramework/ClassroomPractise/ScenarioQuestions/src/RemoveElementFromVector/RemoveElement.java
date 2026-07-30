//Q4. Write a Java program to remove a specific element from a Vector.
//Description
//Store elements in Vector.
//Take element to remove.
//Use remove() method.
//Display updated Vector.
//Input
//Enter elements:
//10
//20
//30
//40
//Enter element to remove:
//30
//Output
//Updated Vector:
//10
//20
//40

package RemoveElementFromVector;
import java.util.*;
public class RemoveElement {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of element");
		int n=sc.nextInt();
		System.out.println("Enter elements");
		Vector<Integer>v=new Vector<>();
		for(int i=0;i<n;i++) {
			v.add(sc.nextInt());
		}
		System.out.println("Enter the element you want to remove");
		v.remove((Object)sc.nextInt());
		System.out.println(v);		
	}

}
