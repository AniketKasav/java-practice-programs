package Model;

public abstract class Employee implements DailyReport{
	final int employeeID;
	String name;
	String department;
	
	public Employee(int employeeID,String name,String department) {
		this.employeeID=employeeID;
		this.name=name;
		this.department=department;
		
	}
	
	public final void companyPolicy() {
	    System.out.println("Company Policy:");
	    System.out.println("\t- Daily work report submission is mandatory.");
	    System.out.println("\t- Employees must follow office ethics and company regulations.");
	    System.out.println("\t- Employee IDs are permanent and cannot be changed.");
	    System.out.println("\t- Salary is calculated according to the employee's role and company payroll policy.");
	}
	
	public abstract void calculateSalary();
}
