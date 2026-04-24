//Example: WAP to input string and check string is palindrome or not
//Input: aba 
//Output: aba 

import java.util.Scanner;
public class Ass6{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String ");
		String str=sc.nextLine();
		int i=0;
		int j=str.length()-1;
		boolean flag=true;
		while(i<j){
			if(str.charAt(i)!=str.charAt(j)){
				flag=false;
				break;
			}
			i++;
			j--;
		}
		if(flag){
			System.out.print("Given String is palindrome ");
		}else{
			System.out.print("Given String is not palindrome ");		
		}
	}
}