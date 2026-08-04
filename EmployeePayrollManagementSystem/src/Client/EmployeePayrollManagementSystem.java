package Client;

import java.util.*;

import Model.*;

public class EmployeePayrollManagementSystem {

	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int choice=-1;
		Employee emp;
		do {
			
			System.out.println("What is role?");
			System.out.println("1. Manager");
			System.out.println("2. Developer");
			System.out.println("3. Tester");
			System.out.println("4. Exit");
			System.out.println("Enter your choice:");
			choice=sc.nextInt();
			
			switch(choice) {
			case 1:
				System.out.println("Enter your id:");
				int id=sc.nextInt();
				System.out.println("Enter your name:");
				sc.nextLine();
				String name=sc.nextLine();
				System.out.println("Enter your department");
				String department=sc.nextLine();
				emp=new Manager(id,name,department);
				emp.companyPolicy();
				emp.submitReport();
				emp.calculateSalary();
				break;
			
			case 2:
				System.out.println("Enter your id:");
				id=sc.nextInt();
				System.out.println("Enter your name:");
				sc.nextLine();
				name=sc.nextLine();
				System.out.println("Enter your department");
				department=sc.nextLine();
				emp=new Developer(id,name,department);
				emp.companyPolicy();
				emp.submitReport();
				emp.calculateSalary();
				break;
				
			case 3:
				System.out.println("Enter your id:");
				id=sc.nextInt();
				System.out.println("Enter your name:");
				sc.nextLine();
				name=sc.nextLine();
				System.out.println("Enter your department");
				department=sc.nextLine();
				emp=new Tester(id,name,department);
				emp.companyPolicy();
				emp.submitReport();
				emp.calculateSalary();
				break;
			
			case 4:
				System.out.println("Program terminated");
				System.exit(0);
			
			default :
				System.out.println("Invalid choice try again");
			
			}
		}while(choice!=4);
		
	}

}
