/*Question 6: Create a base class Book with attributes title and price.
Create a child class EBook that adds fileSize.
Store details of 3 EBooks using an array of objects and display all details.

Description
This program demonstrates inheritance with an array of objects.
The child class EBook extends Book, and multiple objects are stored in an array.

Input
Enter number of EBooks: 3

Enter Title: Java Basics
Enter Price: 300
Enter File Size: 5

Enter Title: Python Guide
Enter Price: 400
Enter File Size: 8

Enter Title: C Programming
Enter Price: 250
Enter File Size: 6
Output
Title: Java Basics, Price: 300, File Size: 5MB
Title: Python Guide, Price: 400, File Size: 8MB
Title: C Programming, Price: 250, File Size: 6MB        */


import java.util.Scanner;
class Book{
	private String title;
	private int price;
	
	void setTitle(String title){
		this.title=title;
	}
	String getTitle(){
		return title;
	}
	void setPrice(int price){
		this.price=price;
	}
	int getPrice(){
		return price;
	}
}

class EBook extends Book{
	private int fileSize;
	
	void setFileSize(int fileSize){
		this.fileSize=fileSize;
	}
	int getFileSize(){
		return fileSize;
	}
	
	void display(){
	System.out.println("Title: "+getTitle()+", Price: "+getPrice()+", File Size: "+getFileSize()+"MB");
	}
}

public class Ass6{
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number of EBooks:");
		int n=sc.nextInt();
		sc.nextLine();
		EBook[] eb=new EBook[n];
		
		for(int i=0;i<n;i++){
			eb[i]=new EBook();
			
			System.out.print("Enter Title :");
			eb[i].setTitle(sc.nextLine());
			System.out.print("Enter Price: ");
			eb[i].setPrice(sc.nextInt());
			System.out.print("Enter File Size:");
			eb[i].setFileSize(sc.nextInt());
            sc.nextLine();			
		}
		System.out.println();

		for (int i=0; i<n;i++) {
			eb[i].display();
		}
		
	}
}