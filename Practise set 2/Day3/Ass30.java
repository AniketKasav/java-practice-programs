/*30. Remove all special characters from a string.

Example
Input:
String = "Hello@123#World!"

Output:
Hello123World

Explanation:
The special characters (@, #, !) are removed from the string, 
leaving only the letters and digits: Hello123World.                 */

import java.util.Scanner;
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the string");
	String str=sc.next();
	System.out.println("Output :");
	str=str.replaceAll("[^0-9a-zA-Z]","");
	System.out.println(str);
}