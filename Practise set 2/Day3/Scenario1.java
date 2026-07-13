/*21. n a Banking System, how would you use constructor overloading to create different types of accounts?

Answer

In a banking system, constructor overloading allows us to create account objects with different sets of information. 
Each constructor has the same name as the class but accepts different parameters. 
This provides flexibility while creating different types of accounts.

For example:
Create an account with only the account holder's name.
Create an account with the name and initial balance.
Create an account with the name, balance, and account type.   */

import java.util.Scanner;
class BankAcc{
	String accHoulder;
	double initialBal;
	String accType;
	
	BankAcc(String accHoulder){
		this.accHoulder=accHoulder;
		this.initialBal=0.0;
		this.accType="Saving";
	}
	
	BankAcc(String accHoulder,double initialBal){
		this.accHoulder=accHoulder;
		this.initialBal=initialBal;
		this.accType="Saving";
	}
	BankAcc(String accHoulder,double initialBal,String accType){
		this.accHoulder=accHoulder;
		this.initialBal=initialBal;
		this.accType=accType;
	}
	void display(){
		System.out.println("Account Holder :"+accHoulder);
		System.out.println("Account Initial Balance :"+initialBal);
		System.out.println("Account Type :"+accType);
		System.out.println();
	}
}

public class Scenario1{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		BankAcc ba1=new BankAcc("aniket1");
		BankAcc ba2=new BankAcc("aniket2",10000);
		BankAcc ba3=new BankAcc("aniket3",15000,"current");
		
		ba1.display();
        ba2.display();
        ba3.display();
	}	
}

