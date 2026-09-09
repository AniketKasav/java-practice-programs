/*Question 4: Write a Java program to demonstrate thread sleep() method.

Create a thread that prints numbers from 1–5 with 1 second delay between each number using sleep() method.
Asked In Practice Assignment
Input:
No input required

Output:
1
(wait 1 sec)
2
(wait 1 sec)
3
(wait 1 sec)
4
(wait 1 sec)
5

Explanation:
Thread.sleep() pauses current thread execution for specified milliseconds. 
Wrap in try-catch to handle InterruptedException. Sleep does not release locks held by thread. 
After sleep duration expires, thread resumes execution. Useful for controlled delays and timing in applications. */

class Test extends Thread{
	public void run(){
		try{
		for(int i=1;i<=5;i++){
			System.out.println(i);
			Thread.sleep(1000);
		}
		}
		catch(InterruptedException e){
			System.out.println("Error is "+e.getMessage());
		}
	}
}

public class Ass4{
	public static void main(String[] args){
		
		Test t=new Test();
		t.start();
		
	}
}