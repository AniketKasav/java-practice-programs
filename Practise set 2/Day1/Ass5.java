//5. Count the number of digits in a string.


import java.util.Scanner;
public class Ass5{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string ");
		String str=sc.nextLine();
		str=str.toLowerCase().trim();
		str=str.replaceAll("[^0-9]","");
		System.out.println("String is : "+str);
		int digits=0;
		for(char ch:str.toCharArray()){
			digits++;
		}
		
		System.out.println("number of digits in a string :"+digits);
	}
}