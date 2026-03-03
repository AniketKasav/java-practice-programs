import java.util.Scanner;

public class Ass13{
	 //Q13. Write a java program to accept two integers and check whether they are equal or not.
	
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the first number : ");
		int a=sc.nextInt();		
		System.out.print("Enter the second number : ");
		int b=sc.nextInt();
		if(a==b){
			System.out.print("Given numbers are equal");
		}else{
			System.out.print("Given numbers are not equal");
		}	
	}
}