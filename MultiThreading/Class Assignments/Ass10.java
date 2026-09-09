/*Question 10: Write a Java program to create a thread that prints a multiplication table.

Create a thread that accepts a number and prints its multiplication table.
Asked In Practice Assignment
Input:
Enter number: 5

Output:
5 x 1 = 5
5 x 2 = 10
5 x 3 = 15
5 x 4 = 20
5 x 5 = 25

Explanation:
Thread can perform calculations and display results. Create thread to accept number 
and iterate from 1 to 10 to print multiplication table. 
Demonstrates thread performing computational task independently.
 Thread execution allows other operations to proceed while calculation runs.   */
 
import java.util.Scanner;

class Table extends Thread{
	int n;
	
	Table(int n){
		this.n=n;
	}
	
	public void run(){
		for(int i=1;i<=10;i++){
			System.out.printf("%d x %d = %d%n",n,i,n*i);
		}
	}
}


public class Ass10{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number ");
		int n=sc.nextInt();
		Table t=new Table(n);
		t.start();
	}
}