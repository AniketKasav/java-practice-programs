//Q55. Write a program to input a character and check whether it is a vowel or consonant using a switch case.
//Explanation: Switch on the lowercase character. Use cases for 'a', 'e', 'i', 'o', 'u'; default for consonant.


import java.util.*;
public class Ass55{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a Alphabet : ");
		char ch=sc.next().toLowerCase().charAt(0);
		
		if(ch>='a' && ch<='z'){
			switch(ch){
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				System.out.print("Vowel");
				break;
			default:
				System.out.print("consonant");
		}
		}else{
			System.out.print("Invalid input !!");
		}
	}
}