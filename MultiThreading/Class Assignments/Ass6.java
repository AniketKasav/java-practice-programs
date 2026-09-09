/*Question 6: Write a Java program to demonstrate the currentThread() method.

Display the currently executing thread name using Thread.currentThread() method.
Asked In Practice Assignment
Input:
No input required

Output:
Current thread is: main

Explanation:
Thread.currentThread() returns reference to currently executing thread. 
Call getName() on returned thread object to get its name. Main method always executes in "main" thread. 
Useful for determining which thread is executing current code. 
Helps in thread-aware programming and debugging.  */

class Test extends Thread{
	public void run(){
		System.out.println("Thread is running !!!");
		System.out.println(Thread.currentThread().getName());
	}
}

public class Ass6{
	public static void main(String[] args){
		
		Test t=new Test();
		t.start();
		System.out.println(Thread.currentThread().getName());
		System.out.println("Main Terminated !!");
	}
}