//Q1.Write a Java program to store 5 integer elements in a Vector and display all elements.
//Description
//Create a Vector of Integer type.
//Accept 5 numbers from user.
//Store them using add() method.
//Display elements using loop.
//Input
//Enter 5 numbers:
//10
//20
//30
//40
//50
//Output
//Vector elements are:
//10
//20
//30
//40
//50

package StoreAndDisplayVectorElement;
import java.util.*;
public class DisplayApp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Vector<Integer>v=new Vector<>();
		System.out.println("Enter the size of the vector :");
		int n=sc.nextInt();
		System.out.printf("Enter the %d integer ",n);
		for(int i=0;i<n;i++) {
			v.add(sc.nextInt());
		}
		System.out.println("Vector Elements are:");
//		//using for loop 
//		for(int i=0;i<v.size();i++) {
//			Object obj=v.get(i);
//			System.out.println(obj);
//		}
		
//		// using for each
//		for(Object obj:v) {
//			System.out.println(obj);
//		}
		
//		// using interator
//		Iterator<Integer> it=v.iterator();
//		while(it.hasNext()) {
//			Object obj=it.next();
//			System.out.println(obj);
//		}
		
		//using enumeration
		Enumeration<Integer>em=v.elements();
		while(em.hasMoreElements()) {
			System.out.println(em.nextElement());
		}
		
	}

}























