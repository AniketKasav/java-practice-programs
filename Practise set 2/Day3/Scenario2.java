/*22.	In an Employee Management System, why would you create multiple constructors for the Employee class?

Answer
In an Employee Management System, we create multiple constructors (constructor overloading)
 so that we can create Employee objects with different levels of information. 
 This makes the class flexible and allows object creation based on the available data.

For example:
Create an employee with only the employee ID.
Create an employee with the employee ID and name.
Create an employee with the employee ID, name, and salary.

This avoids writing multiple classes and provides different ways to initialize an object.
*/
import java.util.Scanner;
class Employee{
	int id;
	String empName;
	double salary;
	
	Employee(int id){
		this.id=id;
		this.empName=null;
		this.salary=0.0;
	}
	
	Employee(int id,String empName){
		this.id=id;
		this.empName=empName;
		this.salary=0.0;
	}
	Employee(int id,String empName,double salary){
		this.id=id;
		this.empName=empName;
		this.salary=salary;
	}
	
	void display(){
		System.out.println("Employee ID :"+id);
		System.out.println("Employee Name :"+empName);
		System.out.println("Employee Salary :"+salary);
		System.out.println();
	}
}

public class Scenario2{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		Employee emp1=new Employee(122);
		Employee emp2=new Employee(122,"Aniket");
		Employee emp3=new Employee(122,"Annie",60000);
		
		emp1.display();
		emp2.display();
		emp3.display();
	}
}