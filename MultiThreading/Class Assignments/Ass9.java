/*Question 9: Write a Java program to demonstrate join() method.

Create two threads. The first thread prints numbers and the second thread waits until the first thread completes using join().
Asked In Practice Assignment
Input:
No input required

Output:
Thread1 running
Thread1 completed
Thread2 started after Thread1

Explanation:
join() method causes calling thread to wait until specified thread completes execution. 
In example, main thread calls thread1.join(), so main waits for thread1 to finish before starting thread2. 
Useful for ensuring sequential execution of dependent tasks among threads. */

public class Ass9{
	public static void main(String[] args)throws InterruptedException{
		
		Thread t1=new Thread(()->{
			for(int i=1;i<=5;i++){
				System.out.println(i);
			}
			System.out.println("Thread1 completed");
		});
		
		Thread t2=new Thread(()->{
			for(int i=6;i<=10;i++){
				System.out.println(i);
			}
			System.out.println("Thread2 completed");
		});
		
		t1.start();
		t1.join();
		t2.start();
		System.out.println("Thread2 started after Thread1");
	}
}