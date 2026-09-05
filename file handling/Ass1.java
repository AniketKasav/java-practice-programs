/*Question 1: Write a Java program to create a file student.txt and store student name and marks into it.
Asked In Practice Assignment
Input:
Enter student name: Rahul
Enter marks: 78

Output:
File created successfully.
Data written successfully.

Explanation:
Create file using FileWriter class with filename student.txt.
 Accept student name and marks from user using Scanner. 
 Write name and marks to file using write() method separated by space. 
 Close FileWriter properly using close() method to save data. 
 FileWriter automatically creates new file if not exists and overwrites if already exists. 
 Proper file closure ensures no data loss.    */
 
import java.io.*;
import java.util.*;
 
public class Ass1{
	public static void main(String[] args) throws IOException {
		Scanner sc=new Scanner(System.in);
		
		FileWriter fw=new FileWriter("C:\\Users\\anike\\Desktop\\ClassAssignments\\file handling\\Files\\test.txt");
		System.out.println("File created successfully.");
		System.out.println("Enter student name :");
		String name=sc.next();
		System.out.println("Enter marks :");
		int marks=sc.nextInt();
		System.out.println("File created successfully.");
		fw.write(name+" "+marks);
		System.out.println("File written successfully.");
		fw.close();
	}
}