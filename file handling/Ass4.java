/* Question 4: Write a Java program to count total words in a file.
Asked In Practice Assignment
Input:
File content:
Java is easy language

Output:
Total words = 4

Explanation:
Read entire file content as string using BufferedReader and StringBuilder.
Split string using space delimiter with split method.
Count number of elements in resulting string array which represents total words.
Handle multiple consecutive spaces correctly using regex pattern.
Alternatively use StringTokenizer to count words. Display total word count. */

import java.io.*;

public class Ass4{
	public static void main(String[] args) throws IOException{
		FileReader fr=new FileReader("C:\\Users\\anike\\Desktop\\ClassAssignments\\file handling\\Files\\test.txt");
		BufferedReader br=new BufferedReader(fr);
		StringBuilder sb=new StringBuilder();
		String str=null;
		while((str=br.readLine())!=null){
			sb.append(str+" ");
		}
		String ans=sb.toString();
		String[] arr=ans.split("\\s+");
		System.out.println("Total words = "+arr.length);
		br.close();
	}
}