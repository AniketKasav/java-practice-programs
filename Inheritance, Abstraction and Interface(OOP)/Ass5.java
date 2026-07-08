/*Question 5: Create a base class Person with method display().
Create a child class Employee that overrides display() to show additional details like designation.

Description
This assignment demonstrates method overriding in inheritance.
The child class modifies the behavior of the parent method.

Input
Enter Name: Suresh
Enter Age: 30
Enter Designation: Manager
Output
Name: Suresh
Age: 30
Designation: Manager  */


import java.util.Scanner;
class Person{
	static Scanner sc=new Scanner(System.in);
	String name;
	int age;
	
	void getPersonData(){
		System.out.print("Enter Name :");
		name=sc.nextLine();
		System.out.print("Enter the Age :");
		age=sc.nextInt();
		sc.nextLine();
	}
	
	void display(){
		System.out.println("Name :"+name);
		System.out.println("Age :"+age);
		
	}
}

class Employee extends Person{
	String designation;
	
	void getEmpData(){
		System.out.print("Enter Designation :");
		designation=sc.nextLine();
	}
	
	void display(){
		System.out.println("Name :"+name);
		System.out.println("Age :"+age);
		System.out.println("Designation :"+designation);
	}
}

public class Ass5{
	public static void main(String [] args){
		Employee emp=new Employee();
		emp.getPersonData();
		emp.getEmpData();
		emp.display();
	}
}