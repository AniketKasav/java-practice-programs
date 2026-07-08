/*Question 4: Create a base class Account with accountNumber and balance.
Create a child class SavingsAccount that adds interestRate.
Calculate final balance after adding interest.

Description
This program uses inheritance to simulate a banking system.
The child class extends functionality by applying interest calculation.

Input
Enter Account Number: 12345
Enter Balance: 10000
Enter Interest Rate: 5

Output
Account Number: 12345
Initial Balance: 10000
Interest: 500
Final Balance: 10500    */

import java.util.Scanner;
class Account{
	static Scanner sc=new Scanner(System.in); 
	long accountNumber ;
	long balance;
	
	void getAccountInfo(){
		System.out.print("Enter Account Number :");
		accountNumber=sc.nextLong();
		//sc.nextLine();
		System.out.print("Enter balance :");
		balance=sc.nextLong();
	}
}

class SavingsAccount extends Account{
	int interestRate;
	long interest;
	long finalbalance;
	
	void getRate(){
		System.out.print("Enter Interest Rate :");
		interestRate=sc.nextInt();
	}
	void getInterest(){
		interest=(balance*interestRate)/100;
		finalbalance=balance+interest;
	}
	
	void display(){
		System.out.println("Account Number :"+accountNumber);
		System.out.println("Initial Balance :"+balance);
		System.out.println("Interest :"+interest);
		System.out.println("Final Balance :"+finalbalance);
	}
}

public class Ass4{
	public static void main(String [] args){
		SavingsAccount sa=new SavingsAccount();
		sa.getAccountInfo();
		sa.getRate();
		sa.getInterest();
		sa.display();
	}
}
