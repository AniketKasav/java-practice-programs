/*Question 2: Write a Java program to create a thread using Runnable interface and display even numbers.

Create a class that implements Runnable interface. Print even numbers between given ranges using run() method.
Asked In Practice Assignment
Input:
Enter limit: 10

Output:
Even numbers are:
2 4 6 8 10

Explanation:
Runnable interface is preferred way to create threads as it avoids single inheritance limitation. 
Implement Runnable, override run() method, and pass instance to Thread constructor. 
This allows class to extend other classes while implementing Runnable. 
Provides better design and flexibility compared to extending Thread class directly.  */

import java.util.Scanner;

class Table implements Runnable{
	
	int n;
	Table(int n){
		this.n=n;
	}
	
	public void run(){
		System.out.println("Even numbers are :");
		for(int i=0;i<=n;i+=2){
			System.out.print(i+"\t");
		}
		System.out.println("\nThread terminated !!");
	}
	
}

public class Ass2{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the number :");
		int num=sc.nextInt();
		
		Runnable r=new Table(num);  // created object
		Thread t=new Thread(r);   // created new thread here
		t.start();   // run the thread task
		System.out.println("Main ended here !!");
	}
}