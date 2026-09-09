/*Question 1: Write a Java program to create a thread using Thread class and display numbers from 1 to 10.

Create a class that extends Thread. Override the run() method and print numbers from 1 to the given limit. 
Start the thread from the main method.
Asked In Practice Assignment
Input:
Enter limit: 10

Output:
Thread started
1 2 3 4 5 6 7 8 9 10
Thread finished

Explanation:
Creating threads using Thread class involves extending Thread and overriding run() method. 
The run() method contains the code to execute in thread. Call start() method to begin thread execution, 
not run() directly. Calling start() initializes thread state and calls run() internally,
 ensuring proper thread execution.  */
 
import java.util.*;

class Test extends Thread{
	int n;
	Test(int n){
		this.n=n;
	}
	public void run(){
			for(int i=1;i<=n;i++){
				System.out.println(i);
			}
			System.out.println("Thread terminated");
	}
}

public class Ass1{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number :");
		int n=sc.nextInt();
		
		Test t=new Test(n);  // thread object in created here
		t.start();  // thread excute it's operation
		
		System.out.println("Main end here !!");
	}
}
 
 