//Q24. Write a java program to check whether a character is uppercase or lowercase alphabet.

import java.util.Scanner;
public class Ass24{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the alphabet : ");
		char ch=sc.nextLine().charAt(0);
		/*if(ch>='A' && ch<='Z'){
			System.out.print("The given alphabet is uppercase !!");
		}else {
			System.out.print("The given alphabet is lowercase !!");
		}*/
		System.out.print((ch>='A' && ch<='Z')?"The given alphabet is uppercase !!":ch>='a' && ch<='z'?"The given alphabet is lowercase !!":"Enter the valid alphabet");
	}
}