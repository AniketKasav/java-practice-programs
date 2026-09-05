/*Question 8: Write a Java program to display file size.
Asked In Practice Assignment
Input:
Input filename:
student.txt

Output:
File size = 120 bytes

Explanation:
Create File object with filename. Use length() method which returns file size in bytes as long value. 
Check if file exists before calling length() using exists() method. For larger files, 
convert bytes to KB by dividing by 1024, to MB by dividing by 1024*1024.
 If file not found, length() returns -1 or throws exception. 
 Display file size with appropriate unit.*/
 
import java.io.*;
import java.util.*;
public class Ass8{
	public static void main(String[] args) throws IOException{
		
		File f=new File("C:\\Users\\anike\\Desktop\\ClassAssignments\\file handling\\Files\\test.txt");
		long fsize=f.length();
		if(fsize==-1){
			System.out.println("File is empty");
		}else{
			System.out.println(fsize+" bytes");
		}
	}
}