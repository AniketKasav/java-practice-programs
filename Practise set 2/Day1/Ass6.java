//6. Count the number of special characters in a string.

import java.util.*;
public class Ass6{
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sc.nextLine();
		int special=0;
		/*for(char ch:str.toCharArray()){
			if(!Character.isLetterOrDigit(ch) && !Character.isWhitespace(ch)){
				special++;
			}
		}*/
		
	//or
	
		str=str.replaceAll("[a-zA-Z0-9\\s]","");
		for(char ch:str.toCharArray()){
			special++;
		}
		System.out.println("number of special characters in a string : "+special);
	}
}