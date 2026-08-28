//Q5. Create an Employee POJO class with id, name, department, salary, and experience. 
//Implement CRUD operations using class , object , pojo class. 
//Add a search operation to find employees based on department and minimum salary.
//Explanation: Create an Employee class with private fields, constructors, getters and setters.
//Maintain employee objects inside an ArrayList. I
//mplement: 
//	• Add Employee 
//	• Update Employee by ID  
//	• Delete Employee by ID  
//	• Display all employees  
//	• Search employees by department 

import java.util.*;

class Employee{
	private int id;
	private String name;
	private String dep;
	private int sal;
	private int exp;
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
	public String getDep() {
		return dep;
	}
	public void setDep(String dep) {
		this.dep = dep;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public int getExp() {
		return exp;
	}
	public void setExp(int exp) {
		this.exp = exp;
	}
	
	
}



public class Q5 {

	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<Employee>emps=new ArrayList<>();
		do {
			
			System.out.println("1. Add Employee ");
			System.out.println("2. Update Employee by ID  ");
			System.out.println("3. Delete Employee by ID  ");
			System.out.println("4. Display all employees  ");
			System.out.println("5. Search employees by department ");
			System.out.println("Enter your choice :");
			int ch=sc.nextInt();
			
			switch(ch) {
			case 1:
				Employee emp=new Employee();
				System.out.println("Enter id name department salary and experience(years)");
				int id=sc.nextInt();
				emp.setId(id);
				sc.nextLine();
				String name=sc.nextLine();
				emp.setName(name);
				String dep=sc.nextLine();
				emp.setDep(dep);
				int sal=sc.nextInt();
				emp.setSal(sal);
				sc.nextLine();
				int exp=sc.nextInt();
				emp.setExp(exp);
				emps.add(emp);
				System.out.println("Employee added ...");
				break;
			
			case 2:
				System.out.println("Enter the old id of the emploee");
				int oldid=sc.nextInt();
				System.out.println("Enter the updated id of the employee");
				int nid=sc.nextInt();
				for(Employee e:emps) {
					if(e.getId()==oldid) {
						e.setId(nid);
						System.out.println("Id updated  ");
					}
				}
				System.out.println("Id not found");
				break;
			
			case 3:
				System.out.println("Enter the id you want to dlt");
				int dltid=sc.nextInt();
				for(Employee e:emps) {
					if(e.getId()==dltid) {
						emps.remove(e);
						System.out.println("Employee deleted");
						
					}
				}
				System.out.println("Rmployee not found ");
				break;
				
			case 4:
				for(Employee e:emps) {
					System.out.println(e.getId()+"\t"+e.getName()+"\t"+e.getDep()+"\t"+e.getSal()+"\t"+e.getExp());
				}
				break;
				
				
			case 5:
				System.out.println("Enter the department name:");
				String sdep=sc.nextLine();
				for(Employee e:emps) {
					if(e.getDep()==sdep) {
						System.out.println(e.getId()+"\t"+e.getName()+"\t"+e.getDep()+"\t"+e.getSal()+"\t"+e.getExp());
					}
				}
				break;
				
			default :
				System.out.println("Invalid choice ");
			}
			
			
		}while(true);

	}

}























