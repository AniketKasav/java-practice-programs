/*Q10. Write a Java program that uses a void function to print the Fibonacci series up to N terms.
Explanation
Pass number of terms to the function
Use loop to generate series
Print each term inside the function
No recursion and no return type         */

import java.util.Scanner;
public class Ass10{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num=sc.nextInt();
		fibonacci(num);
	}
	
	public static void fibonacci(int n) {
        int f1 = 0, f2 = 1;
        if (n >= 1) {
            System.out.print(f1 + " ");
        }
        if (n >= 2) {
            System.out.print(f2 + " ");
        }
        for (int i = 3; i <= n; i++) {
            int f3 = f1 + f2;
            System.out.print(f3 + " ");
            f1 = f2;
            f2 = f3;
        }
    }
}