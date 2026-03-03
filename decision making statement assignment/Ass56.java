//Q56. Create a Java program using switch to convert a given number (1-5) to its word equivalent
//(One, Two, ..., Five). If the number is not between 1 and 5, display “Invalid number”.
//Explanation: Switch with cases 1 to 5; default to handle invalid numbers.

import java.util.*;

public class Ass56{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the number between 1 to 5 :");
		int n=sc.nextInt();
		
		switch(n){
			case 1:
				System.out.print("One");
				break;
			case 2:
				System.out.print("Two");
				break;
			case 3:
				System.out.print("Three");
				break;
			case 4:
				System.out.print("Four");
				break;
			case 5:
				System.out.print("Five");
				break;
			default :
				System.out.print("Invalid Number !!");
			
		}
		
		
	}
}
