//4. Count the number of consonants in a string.

import java.util.Scanner;
public class Ass4{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string ");
		String str=sc.nextLine();
		str=str.toLowerCase().trim();
		str=str.replaceAll("[^a-zA-Z]","");
		//System.out.println("String is : "+str);
		int consonants=0;
		for(char ch:str.toCharArray()){
			if(ch!='a' && ch!='i' && ch!='o' && ch!='u' && ch!='e'){
				consonants++;
			}
		}
		
		System.out.println("number of consonants in a string :"+consonants);
	}
}