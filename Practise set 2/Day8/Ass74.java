/*74. Implement your own version of `String.substring()`.

The idea of substring() is to extract a specific part of a string using index positions.
Example 1: Using start and end index
Suppose:
String = "Hello World"
Start index = 6
End index = 11
Index positions:

Index	    0	1	2	3	4	5	6	7	8	9	10
Character	H	e	l	l	o space	W	o	r	l	d

We start copying characters from index 6 and stop before index 11:

W → o → r → l → d

Result = "World"

Important: The start index is included, but the end index is excluded. */

import java.util.Scanner;
public class Ass74{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string :");
		String str=sc.nextLine();
		System.out.print("Enter start idex:");
		int start=sc.nextInt();
		System.out.print("Enter end idex:");
		int end=sc.nextInt();
		StringBuilder sb=new StringBuilder();
		for(int i=start;i<end;i++){
			sb.append(str.charAt(i));
		}
		
		System.out.println("Result : "+sb);
	}
}
