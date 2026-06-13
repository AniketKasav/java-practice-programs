/*Question 8: Write a Java program to implement a Bank Balance Checker.
Create a class BankAccount with attributes accountNumber, name, and balance.
Check account status:
- balance >= 10000 => Premium Account
- balance 5000 to 9999 => Normal Account
- balance < 5000 => Low Balance Warning
Asked In: Practice assignment
Run
Clear
Input:
Enter Account Number : 98765
Enter Name : Neha
Enter Balance : 4500

Output:
Account Number : 98765
Name : Neha
Balance : 4500
Status : Low Balance Warning

Explanation:
A class BankAccount is created with accountNumber, name, and balance.
The user inputs all three values via Scanner.
An if-else ladder determines the account status:
- balance >= 10000 => Premium Account
- balance >= 5000 && balance <= 9999 => Normal Account
- balance < 5000 => Low Balance Warning
Since 4500 < 5000, the status is Low Balance Warning.
This program models a real-world banking classification using class objects. */

import java.util.Scanner;
class BankAccount{
	int accountNumber;
	String name;
	int balance;
	BankAccount(){
		accountNumber=0;
		name="";
		balance=0;
	}
	void applyDiscount(){
		System.out.println("Account Number :"+accountNumber);
		System.out.println("Name : "+name);
		System.out.println("Balance :"+balance);
		System.out.print("Status : ");
		if(balance>=10000){
			System.out.println("Premium Account");
	
		}else if(balance>=5000){
			System.out.println("Normal Account");
		
		}else{
			System.out.println(" Low Balance Warning");
		}
	}
}

public class Ass8{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		BankAccount ba=new BankAccount();
		System.out.print("Enter Account Number :");
		ba.accountNumber=sc.nextInt();
		System.out.print("Enter Name :");
		ba.name=sc.next();
		System.out.print("Enter balance :");
		ba.balance=sc.nextInt();
		
		ba.applyDiscount();
	}
}
