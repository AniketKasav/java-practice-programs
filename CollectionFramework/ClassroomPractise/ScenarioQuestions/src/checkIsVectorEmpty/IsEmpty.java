//Q10. Write a Java program to check whether a Vector is empty or not.
//Description
//Create a Vector.
//Check using isEmpty() method.
//Print appropriate message.
//Input
//Enter number of elements:
//0
//Output
//Vector is empty	

package checkIsVectorEmpty;

import java.util.Scanner;
import java.util.Vector;

public class IsEmpty {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Vector<Integer>v1=new Vector<>();
		Vector<Integer>v2=new Vector<>();
		v2.add(25);
		v2.add(45);
		System.out.println("Vector v1 is empty :"+v1.isEmpty());
		System.out.println("Vector v2 is empty :"+v2.isEmpty());
		
		
		

	}
}
