/*6. Find Length Without Built-in Function (No LeetCode)
Given a string, determine its length without using any built-in length function. Traverse the
string manually and count the characters.
Example: Input: "coding" → Output: 6             */

import java.util.Scanner;
class Ass6{
    public static void main(String[] args) {
		// convert the strign in character array and then count the character in array
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string : ");
		
        String str = sc.nextLine();
		int count=0;
        for(char ch:str.toCharArray()){
			count++;
		}
		System.out.print("Length of the string : "+count);
    }
}

