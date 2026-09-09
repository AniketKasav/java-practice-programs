/*Question 3: Write a Java program to create two threads where one prints numbers and another prints alphabets.

Create two separate threads. The first thread prints numbers from 1–5 and 
the second thread prints characters from A–E.
Asked In Practice Assignment
Input:
No input required

Output:
Numbers Thread: 1 2 3 4 5
Alphabet Thread: A B C D E

Explanation:
Multiple threads execute concurrently, allowing parallel execution of different tasks. 
Create separate Runnable implementations for each task and start multiple Thread objects. 
Both threads execute independently and may interleave their output due to scheduling. 
Demonstrates concurrent execution of independent operations.   */


class Number implements Runnable{
	public void run(){
		try{
		for(int i=1;i<=5;i++){
			System.out.println(i+"  ");
			Thread.sleep(1000);
		}
		System.out.println("Thread Number terminated");
		}
		catch(InterruptedException e){
			System.out.println("Error is "+e.getMessage());
		}
	}
}

class Alphabet implements Runnable{
	
	public void run(){
	try{
		for(int i=0;i<5;i++){
			System.out.println((char)(i+'a')+"  ");
			Thread.sleep(1000);
		}
		System.out.println("Thread Alphabet terminated");
	}
	catch(InterruptedException e){
			System.out.println("Error is "+e.getMessage());
		}
	}
	
}

public class Ass3{
	public static void main(String[] args){
		Number n=new Number();
		Alphabet a=new Alphabet();
		Thread tn=new Thread(n);
		Thread ta=new Thread(a);
		tn.start();
		ta.start();
		
	}
}

