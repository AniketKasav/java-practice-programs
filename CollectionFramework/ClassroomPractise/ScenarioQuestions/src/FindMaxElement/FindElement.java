//Q5. Write a Java program to find the maximum element in a Vector.
//Description
//Store integer values.
//Assume first element as max.
//Compare with remaining elements.
//Print maximum value.
//Input
//Enter elements:
//12
//45
//7
//89
//34
//Output
//Maximum element is 89

package FindMaxElement;
import java.util.*;
public class FindElement {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Vector<Integer>v=new Vector<>();
		System.out.println("Enter the number of element");
		int n=sc.nextInt();
		System.out.println("Enter elements");
		for(int i=0;i<n;i++) {
			v.add(sc.nextInt());
		}
		
		int max=Integer.MIN_VALUE;
		for(int it:v) {
			if(it>max) {
				max=it;
			}
		}
		System.out.println("Maximum element is "+max);
	}
}
