/*Question 10: Write a Java program to display file path.
Asked In Practice Assignment
Input:
Input filename:
student.txt

Output:
File path: C:\Users\Java\student.txt

Explanation:
Create File object with filename. Use getAbsolutePath() method to get complete path from root directory.
getPath() returns path as specified in File constructor. 
getCanonicalPath() returns simplified absolute path removing redundant components. 
Display file location showing where file is stored in system. 
Useful for verification and debugging file operations in application. */

import java.io.*;
import java.util.*;
public class Ass10{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the file name or relative path(eg. ..\\\\filename)");
		String path=sc.nextLine();
		File f=new File(path);
		
		System.out.println(f.getAbsolutePath());
	}
}

