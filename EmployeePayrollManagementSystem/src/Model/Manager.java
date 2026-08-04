package Model;
import java.util.*;
public class Manager extends Employee {
	Scanner sc=new Scanner(System.in);
	public Manager(int employeeID, String name, String department) {
		super(employeeID, name, department);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void calculateSalary() {
		System.out.println("Your salary is (monthly):"+1_10_000);
	}

	@Override
	public void submitReport() {
		
		System.out.println("Submit your daily report.....");
		System.out.println("Enter the number of meetings conducted today:");
		int meetings=sc.nextInt();
		System.out.println("Enter the number of employees supervised today:");
		int employees=sc.nextInt();
		System.out.println("Manager's daily report submitted successfully.");
	}

}
