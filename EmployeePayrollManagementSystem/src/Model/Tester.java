package Model;
import java.util.*;
public class Tester extends Employee {
	int workHours=0;
	int bugs=0;
	final int hourlyRate=70;
	final int perBug=10;
	Scanner sc=new Scanner(System.in);
	public Tester(int employeeID, String name, String department) {
		super(employeeID, name, department);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void calculateSalary() {
		System.out.println(workHours*hourlyRate+bugs*perBug);
		
	}

	@Override
	public void submitReport() {
		System.out.println("Submit your daily report !!!");
		System.out.print("Enter how many hours you work today :");
		workHours=sc.nextInt();
		sc.nextLine();
		System.out.print("Enter how many bugs you solved today :");
		bugs=sc.nextInt();
		sc.nextLine();
		
	}

}
