/*Question 3: Write a Java program to count total characters in a file.
Asked In Practice Assignment
Input:
File content:
Java Programming

Output:
Total characters = 16

Explanation:
Open file using FileReader to read character by character. Initialize counter to zero.
Use read() method in loop to read each character including spaces.
Increment counter for every character read. When read() returns -1, file end is reached.
Count includes all characters: letters, digits, spaces, and special characters. Display final count. */

import java.io.*;
 
public class Ass3{
	public static void main(String[] args) {
		try{
			FileReader fr=new FileReader("C:\\Users\\anike\\Desktop\\ClassAssignments\\file handling\\Files\\test.txt");
			int data;
			int count=0;
			while((data=fr.read())!=-1){
				count++;
				System.out.print((char)data+"  ");
			}
			System.out.println("\nTotal characters ="+count);
		}
		catch(IOException e){
			System.out.println("Error is "+e.getMessage());
		}
	}
}