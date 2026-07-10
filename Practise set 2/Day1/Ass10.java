//10. Check whether a string is a palindrome.

import java.util.Scanner;
public class Ass10{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string ");
		String str=sc.nextLine();
		str=str.toLowerCase();
		boolean flag=true;
		int i=0;
		int j=str.length()-1;
		while(i<j){
			if(str.charAt(i)!=str.charAt(j)){
				flag=false;
				break;
			}
			i++;
			j--;
		}
		if(flag){
			System.out.println("Given String is palindrome");
		}else{
			System.out.println("Given String is not palindrome");	
		}
	}
}