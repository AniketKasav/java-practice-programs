/*Question 11: Write a Java program where two threads print odd and even numbers separately.

Create two threads. One prints odd numbers and another prints even numbers from 1 to N.
Asked In Practice Assignment
Input:
Enter limit: 10

Output:
Odd Thread: 1 3 5 7 9
Even Thread: 2 4 6 8 10

Explanation:
Two separate threads execute independently to print different number ranges. 
First thread checks i%2!=0 for odd, second checks i%2==0 for even. 
Threads run concurrently, allowing parallel number processing. 
Output order may vary due to thread scheduling, but both complete independent tasks.   */

import java.util.Scanner;

class Even extends Thread{
	int n;
	Even(int n){
		this.n=n;
	}
	
	public void run(){
		System.out.println("Even Thread :");
		for(int i=2;i<=n;i+=2){
			System.out.print(i+"  ");
		}
		System.out.println();
	}
}
class Odd extends Thread{
	int n;
	Odd(int n){
		this.n=n;
	}
	
	public void run(){
		System.out.println("Odd Thread :");
		for(int i=1;i<=n;i+=2){
			System.out.print(i+"  ");
		}
		System.out.println();
	}
}

public class Ass11{
	public static void main(String[] args) throws InterruptedException{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number ");
		int n=sc.nextInt();
		
		Even e=new Even(n);
		Odd o=new Odd(n);
		o.start();
		o.join();
		e.start();
	}
}