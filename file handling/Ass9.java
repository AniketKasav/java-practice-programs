/*Question 9: Write a Java program to delete a file.
Asked In Practice Assignment
Input:
Input filename:
student.txt

Output:
File deleted successfully
OR
File not found or deletion failed

Explanation:
Create File object with filename to delete. Check if file exists using exists() method. 
If exists, call delete() method which returns boolean. Returns true if deletion successful, false if deletion fails. 
After successful deletion, file no longer exists and cannot be recovered. 
Display appropriate success or failure message to user. 
Verify deletion with exists() method.   */

import java.io.*;
import java.util.*;
public class Ass9{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the file path");
		String path=sc.nextLine();
		File f=new File(path);
		if(f.exists()){
			if(f.delete()){
			System.out.println("File deleted successfully");
			}else{
			System.out.println("File not found or deletion failed");
			}
		}else{
			System.out.println("File not found or deletion failed");
		}
		
	}
}