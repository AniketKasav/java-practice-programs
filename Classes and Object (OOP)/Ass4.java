/*Question 4: Write a Java program to implement a Voting Eligibility Checker.
Create a class Person with attributes name and age.
Check whether the person is eligible for voting.
Condition: Age >= 18 => Eligible, Otherwise => Not Eligible.
Asked In: Practice assignment
Run
Clear
Input:
Enter Name : Rohan
Enter Age : 16

Output:
Name : Rohan
Age : 16
Result : Not Eligible for Voting

Explanation:
A class Person is created with instance variables name and age.
An object is created and user inputs name and age using Scanner.
Condition: if (age >= 18) => Eligible for Voting, else => Not Eligible for Voting.
Since age = 16, which is less than 18, the result is Not Eligible for Voting.
If age were 18 or above (e.g., 20), the result would be Eligible for Voting.
This program demonstrates how class attributes are used with real-world conditional logic.  */


import java.util.Scanner;
class Person{
	String name;
	int age;
	Person(){
		name="";
		age=0;
	}
	void checkEligibility(){
		System.out.println("Name : "+name);
		System.out.println("Age : "+age);
		if(age>=18){
			System.out.println("Result : Eligible for Voting");
		}else{
			System.out.println("Result : Not Eligible for Voting");	
		}
		
	}
}

public class Ass4{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		Person p=new Person();
		System.out.print("Enter Name :");
		p.name=sc.next();
		System.out.print("Enter Age : ");
		p.age=sc.nextInt();
		p.checkEligibility();
	}
}