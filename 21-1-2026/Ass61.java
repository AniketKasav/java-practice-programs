/*Q61. Write a menu-driven program in java using switch case.
           	1.Addition
           	2.Subtraction
           	3.Multiplication
           	4.Division 
			5. Exit*/
			
import java.util.*;
public class Ass61{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int ch;
		do{
			System.out.print("Menu....\n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5. Exit");
			System.out.print("Enter your choice : ");
			ch=sc.nextInt();
			System.out.println("Enter two numbers :");
			int a=sc.nextInt();
			int b=sc.nextInt();
			switch(ch){
			case 1:
				System.out.println(a+b);
				break;
			case 2:
				System.out.println(a-b);
				break;
			case 3:
				System.out.print(a*b);
				break;
			case 4:
				System.out.println(a/b);
				break;
			case 5:
				System.out.println("Exit ..");
				break;
			default :
				System.out.println("Invalid operator !!");
		}	
			
		}while(ch!=5);
		
	}
}
