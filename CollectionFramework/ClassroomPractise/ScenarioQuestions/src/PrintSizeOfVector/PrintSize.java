//Q2. Write a Java program to store N elements in a Vector and print the total number of elements.
//Description
//Create Vector.
//Take number of elements from user.
//Store values.
//Use size() method to find total elements.
//Input
//Enter number of elements:
//4
//
//Enter elements:
//5
//15
//25
//35
//Output
//Total elements in vector = 4

package PrintSizeOfVector;
import java.util.*;
public class PrintSize {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		Vector<Integer>v=new Vector();
		System.out.println("Enter the capacity of vector");
		int n=sc.nextInt();
		System.out.printf("Enter the %d elements\n",n);
		for(int i=0;i<n;i++) {
			v.add(sc.nextInt());
		}
		System.out.printf("Total elements in vector = %d",v.size());
	}

}
