/*Q52: Create a Java program to simulate a simple calculator using a switch case.
It should take two numbers and an operator (+, -, *, /, %) as input and perform the corresponding operation.
Explanation: Use a switch on the operator to handle different arithmetic operations.
 Add default to handle invalid operators.*/
 
import java.util.*;
public class Ass52{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers :");
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("Enter the operator (+, -, *, /, %):");
		char op=sc.next().charAt(0);
		
		switch(op){
			case '+':
				System.out.println(a+b);
				break;
			case '-':
				System.out.println(a-b);
				break;
			case '/':
				System.out.print(a/b);
				break;
			case '*':
				System.out.println(a*b);
				break;
			case '%':
				System.out.println(a%b);
				break;
			default :
				System.out.println("Invalid operator !!");
		}
		
	}
}
