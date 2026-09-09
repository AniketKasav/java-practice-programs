/*Question 7: Write a Java program to create multiple threads and display their priorities.

Create three threads and assign different priorities using setPriority(). Display their priorities.
Asked In Practice Assignment
Input:
No input required

Output:
Thread1 Priority: 3
Thread2 Priority: 6
Thread3 Priority: 9

Explanation:
Thread priorities range from 1 (MIN_PRIORITY) to 10 (MAX_PRIORITY), default is 5 (NORM_PRIORITY). 
Higher priority threads are favored for execution. Set priority using setPriority() before starting thread. 
Get priority using getPriority(). Priority affects scheduler behavior but does not guarantee execution order. */

public class Ass7{
	public static void main(String[] args) throws InterruptedException IllegalMonitorStateException{
		
		Runnable r1=new Runnable(){   //Using an anonymous class
			public void run(){
				System.out.println("Thread r1 is running");
				
			}
		};
		
		Runnable r2=()->{  //Using a lambda expression
			System.out.println("Thread r2 is running");
		};
		
		Thread t1=new Thread(r1);
		Thread t2=new Thread(r2);
		Thread t3=new Thread(()->{
			System.out.println("Thread r3 is running");
		});
		
		t1.setPriority(3);
		t2.setPriority(5);
		t3.setPriority(9);
		t1.start();
		t2.start();
		t3.start();
		
		System.out.println("Thread1 Priority:"+t1.getPriority());
		System.out.println("Thread2 Priority:"+t2.getPriority());
		System.out.println("Thread3 Priority:"+t3.getPriority());
		
	}
}