/*Q58. Develop a program to simulate a basic banking menu:
 1: Deposit
 2: Withdraw
 3: Check Balance
 4: Exit
 Use a switch to handle user choice and print appropriate messages.
Explanation: Switch on user choice. Use variables for balance and update accordingly.*/

import java.util.*;
public class Ass58{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int curr=1000;	
		int ch;
		do{
			System.out.println("Menu....\n1: Deposit\n2: Withdraw\n3: Check Balance\n4: Exit");
			System.out.print("Enter your choice :");
			ch=sc.nextInt();
			
			switch(ch){
				case 1:
					System.out.print("Enter the deposit amount : ");
					int a=sc.nextInt();
					curr=curr+a;
					System.out.printf("%d Amount is deposit and current balance is %d\n",a,curr);
					break;
				case 2:
					System.out.print("Enter the withdraw amount : ");
					int b=sc.nextInt();
					curr=curr-b;
					System.out.printf("%d Amount is withdraw and current balance is %d\n",b,curr);
					break;
				case 3:
					System.out.println("your current balance : "+curr);
					break;
				case 4:
					System.out.println("Thnaku for using this service !!!");
					break;
				default:
					System.out.print("Enter valid input ..");
			}
		}while(ch!=4);
		
		
		
	}
}
