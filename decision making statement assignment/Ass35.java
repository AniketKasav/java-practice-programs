/*Q35. Check if a person is a child, teenager, adult, or senior based on age.
 
    Input: Age
    Logic: if-else if
    Output: Age category.*/
	
import java.util.Scanner;

public class Ass35{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your age : ");
		int age=sc.nextInt();
		
		if(age<=0){
			System.out.print("Invalid age ");
			return;
		}
		
		if(age<15){
			System.out.print("child");
		}else if(age<18){
			System.out.print("teenager");
		}else if(age<31){
			System.out.print("adult");
		}else{
			System.out.print("senior");
			
		}
		
	}
}

