//Q22.Problem Statement
//Create a Java program to manage employee salary details using Vector and POJO class Employee. 
//The program must perform logical operations related to employee salary analysis.
//
//Description
//Employee fields:
//●	int empId
//●	String name
//●	double salary
//●	String department
//Store objects in Vector.
//Operations
//1.	Add employees
//2.	Display employees
//3.	Find employee with lowest salary
//4.	Calculate total salary of all employees
//5.	Display employees of a specific department
//
//Input
//Enter number of employees: 3
//
//Enter details:
//1 Raj 45000 IT
//2 Simran 52000 HR
//3 Kunal 39000 IT Enter department:
// 
//IT
//
//Output
//Employee List:
//1 Raj 45000 IT
//2 Simran 52000 HR
//3 Kunal 39000 IT
//
//Lowest Salary:
//3 Kunal 39000 IT Total Salary = 136000
//IT Department Employees:
//Raj Kunal

import java.util.*;

class Employee{
	int empId;
	String name;
	double salary;
	String department;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
}


public class Ass22 {

	public static void main(String[] args) {
		Vector<Employee>v=new Vector<>();
		Scanner sc=new Scanner(System.in);
		
		do {
			System.out.println("1. Add employees");
			System.out.println("2. Display employees");
			System.out.println("3. Find employee with lowest salary");
			System.out.println("4. Calculate total salary of all employees");
			System.out.println("5. Display employees of a specific department");
			System.out.println("6. exit");
			System.out.println("Enter your choice");
			int choice=sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Enter the number of employees");
				int n=sc.nextInt();
				for(int i=0;i<n;i++) {
					Employee e=new Employee();
					System.out.println("Enter employee Details(id,name,salary,department):");
					e.setEmpId(sc.nextInt());
					sc.nextLine();
					e.setName(sc.nextLine());
					e.setSalary(sc.nextInt());
					sc.nextLine();
					e.setDepartment(sc.nextLine());
					v.add(e);
				}
				break;
			case 2:
				System.out.println("=============================================");
				System.out.println("id\tname\tsalary\tdepartment");
				for(Employee e:v) {
					System.out.println(e.getEmpId()+"\t"+e.getName()+"\t"+e.getSalary()+"\t"+e.getDepartment());
				}
				System.out.println("=============================================");
				break;
			case 3:
				Employee me=new Employee();
				double min=Integer.MAX_VALUE;
				for(Employee e:v) {
					if(e.getSalary()<min) {
						min=e.getSalary();
						me=e;
					}
				}
				System.out.println("=============================================");
				System.out.println("Lowest salary :\n");
				System.out.println(me.getEmpId()+"\t"+me.getName()+"\t"+me.getSalary()+"\t"+me.getDepartment());
				System.out.println("=============================================");
				break;
			case 4:
				double tsalary=0.0;
				for(Employee e:v) {
					tsalary+=e.getSalary();
				}
				System.out.println("=============================================");
				System.out.println("Lowest salary ="+tsalary);
				System.out.println("=============================================");
				break;
			case 5:
				System.out.println("Enter the dpartment name");
				sc.nextLine();
				String dep=sc.nextLine();
				System.out.println("=============================================");
				System.out.printf("%s Department Employees:\n",dep);
				for(Employee e:v) {
					if(e.getDepartment().equals(dep)) {
						System.out.println(e.getEmpId()+"\t"+e.getName()+"\t"+e.getSalary()+"\t"+e.getDepartment());
					}
				}
				System.out.println("=============================================");
				break;
			case 6:
				System.out.println("Program Terminated");
				System.exit(0);
				break;
			default :
				System.out.println("Wrong choice");
			}
		}while(true);
	}

}
