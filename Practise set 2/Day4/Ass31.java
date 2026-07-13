/*31. Remove all vowels from a string.

Example:
Input:
Hello World

Output:
Hll Wrld

Here, the vowels e, o, o are removed, and all other characters (including the space) remain.   */


import java.util.Scanner;
public class Ass31{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=sc.nextLine();
		str=str.replaceAll("[aiuoeAIOUE]","");
		System.out.println("Output:\n"+str);
	}
}