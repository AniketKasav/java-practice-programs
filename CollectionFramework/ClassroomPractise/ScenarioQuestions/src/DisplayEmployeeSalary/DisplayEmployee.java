//Q12.Create an Employee POJO class with:
//id
//name
//salary
//Store employees in Vector and display employees having salary greater than 25000.
//Description
//Logical operation:
//if(salary > 25000)
//Input
//1 Raj 20000
//2 Simran 30000
//3 Ajay 27000
//4 Ramesh 18000
//Output
//Employees with salary above 25000:
//
//2 Simran 30000
//3 Ajay 27000

package DisplayEmployeeSalary;
import java.util.*;

class Employee{
	int id;
	String name;
	int Salary;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return Salary;
	}
	public void setSalary(int salary) {
		Salary = salary;
	}
	
}


public class DisplayEmployee {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Vector<Object>v=new Vector<>();
		System.out.println("Enter the number of employees");
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			System.out.println("Enter the id name and salary of employee "+(i+1));
			Employee emp=new Employee();
			emp.setId(sc.nextInt());
			sc.nextLine();
			emp.setName(sc.nextLine());
			emp.setSalary(sc.nextInt());
			v.add(emp);
		}
		System.out.println("Employees with salary above 25000:");
		for(Object obj:v) {
			Employee emp=(Employee)obj;
			if(emp.getSalary()>=25000) {
				System.out.println(emp.getId()+"\t"+emp.getName()+"\t"+emp.getSalary()+"\n");
			}
		}
	}
	
}





















