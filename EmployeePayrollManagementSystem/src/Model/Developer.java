package Model;
import java.util.*;
public class Developer extends Employee {

	Scanner sc=new Scanner(System.in);
	int workHours=0;
	final int hourlyRate=100;
	public Developer(int employeeID, String name, String department) {
		super(employeeID, name, department);
	}

	@Override
	public void calculateSalary() {
		System.out.println("Your salary is (Daily): "+(workHours*hourlyRate));
	}

	@Override
	public void submitReport() {
		System.out.println("Submit your daily report !!!");
		System.out.print("Enter how many hours you work today :");
		workHours=sc.nextInt();
		sc.nextLine();
	}

}
