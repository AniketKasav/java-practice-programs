/*18. Toggle Case of Characters (No LeetCode)
Given a string, change all uppercase letters to lowercase and all lowercase letters to uppercase.
Return the transformed string.
Example: Input: "HeLLo" → Output: "hEllO"   */

import java.util.Scanner;
class Ass18{
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter  string : ");
		String str=sc.nextLine();
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<str.length();i++){
			char ch=str.charAt(i);
			if(ch>='A' && ch<='Z'){
				ch=(char)(ch+32);
			}else{
				ch=(char)(ch-32);
			}
			sb.append(ch);
		}
		System.out.print("Output : "+sb.toString());
    }
}