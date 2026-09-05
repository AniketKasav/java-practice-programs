/*Question 2: Write a Java program to read data from student.txt and display it.
Asked In Practice Assignment
Input:
File exists with content:
Rahul 78

Output:
Student Data:
Rahul 78

Explanation:
Open student.txt using FileReader and wrap with BufferedReader for efficient reading.
Use readLine() method to read complete line from file. Parse the line to extract student name and marks.
Display extracted data in formatted output. Handle FileNotFoundException if file does not exist.
Close BufferedReader after reading completes to free system resources.   */

import java.io.*;
//import java.util.*;
 
public class Ass2{
	public static void main(String[] args) {
		try(FileReader fr=new FileReader("C:\\Users\\anike\\Desktop\\ClassAssignments\\file handling\\Files\\student.txt");){
		BufferedReader br=new BufferedReader(fr);
		System.out.println("Student Data :\n"+br.readLine());
		}
		catch(IOException e){
			System.out.println("Error is "+e.getMessage());
		}
	}
}