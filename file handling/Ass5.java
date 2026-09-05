/*Question 5: Write a Java program to count total lines in a file.
Asked In Practice Assignment
Input:
File content:
Java
Python
C++

Output:
Total lines = 3

Explanation:
Use BufferedReader to read file. Initialize line counter to zero. 
Loop continuously using readLine() method to read each line. Increment counter for each non-null line read. 
When readLine() returns null, end of file reached, stop loop. Display total line count. 
Each line terminated by newline character is counted as one line. */

import java.io.*;

public class Ass5{
	public static void main(String[] args) throws IOException{
		
		FileReader fr= new FileReader("C:\\Users\\anike\\Desktop\\ClassAssignments\\file handling\\Files\\test.txt");
		BufferedReader br=new BufferedReader(fr);
		int Lcount=0;
		String data=null;
		while((data=br.readLine())!=null){
			Lcount++;
		}
		
		System.out.println("Total Lines = "+Lcount);
		br.close();
	}
}