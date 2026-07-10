//9. Reverse a string.


import java.util.*;
public class Ass9{
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string ");
		String str=sc.nextLine();
		StringBuilder sb=new StringBuilder();
		for(int i=str.length()-1;i>=0;i--){
			sb.append(str.charAt(i));
		}
		System.out.println("Reverse String : "+sb.toString());
		
		
		// using for each loop we can do like this 
		// sb.insert(0,ch);
	}
}