//3. Count the number of vowels in a string.

import java.util.Scanner;
public class Ass3{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string ");
		String str=sc.nextLine();
		str=str.toLowerCase();
		int vowel=0;
		for(char ch:str.toCharArray()){
			if(ch=='a' || ch=='i' || ch=='o' || ch=='u' || ch=='e'){
				vowel++;
			}
		}
		
		System.out.println("number of vowels in a string :"+vowel);
	}
}