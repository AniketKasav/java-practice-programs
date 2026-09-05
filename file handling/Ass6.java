/*Question 6: Write a Java program to append data into an existing file.
Asked In Practice Assignment
Input:
Existing file contains:
Rahul 78
New data to append:
Amit 85

Output:
Data appended successfully.

Explanation:
Create FileWriter with filename and append parameter set to true.
FileWriter(filename, true) opens file in append mode. 
When append is true, new data adds at file end without overwriting existing content. 
When false (default), file content is overwritten. Write new data using write() method. 
Close FileWriter to save appended data. Previous content is preserved. */

import java.io.*;
import java.util.*;
public class Ass6{
	public static void main(String[] args) throws IOException{
		
		Scanner sc=new Scanner(System.in);
		FileWriter fw= new FileWriter("C:\\Users\\anike\\Desktop\\ClassAssignments\\file handling\\Files\\test.txt",true);
		System.out.println("New data to append name and marks");
		System.out.println("Enter name :");
		String name=sc.next();
		System.out.println("Enter marks :");
		int marks=sc.nextInt();
		fw.write("\n");
		fw.write(name+" "+marks);
		System.out.println("Data appended successfully.");
		fw.close();
	}
}