/*Question 1: Create a base class Employee with attributes name and salary.
Create a child class Manager that adds bonus.
Calculate total salary using inheritance.
Asked In Practice Assignment
Description
This program demonstrates single inheritance where Manager inherits from Employee.
The child class extends functionality by adding a bonus and calculating total salary.

Input
Enter Name: Rahul
Enter Salary: 50000
Enter Bonus: 10000

Output
Employee Name: Rahul
Base Salary: 50000
Bonus: 10000
Total Salary: 60000    */

import java.util.Scanner;

class Employee {
	String name;
	int salary;
	
	void getEmpData(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name");
		name=sc.nextLine();
		System.out.println("Enter the salary");
		salary=sc.nextInt();
	}
}

class Manager extends Employee{
	int bonus;
	
	void getManagerData(){
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the bonus");
		bonus=sc.nextInt();
	}
		
	void display(){
		System.out.println("Employee Nmae : "+name);
		System.out.println("Base Salary :"+salary);
		System.out.println("Bonus :"+bonus);
		System.out.println("Total Salary :"+(salary+bonus));
	}
}

public class Ass1{
	public static void main(String[] args){
		Manager m=new Manager();
		m.getEmpData();
		m.getManagerData();
		m.display();
		
	}
}