//Comparable
//5.	Sort Employees Using Comparable
//Create an Employee class with:
//	id
//	name
//	salary
//Implement Comparable<Employee> and sort employees based on salary in ascending order.

import java.util.*;

class Employee1 implements Comparable<Employee>{
	int id;
	String name;
	int salary;
	
	public Employee(int id,String name,int salary) {
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	
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
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public int compareTo(Employee o) {
		if(this.salary>o.salary) {
			return 1;
		}else if(this.salary<o.salary) {
			return -1;
		}else {
		return 0;
		}
	}
}


public class Ass5 {

		public static void main(String[] args) {
			
			ArrayList<Employee> ls=new ArrayList<>();
			ls.add(new Employee(1,"Aniket",55000));
			ls.add(new Employee(2,"Priya",50000));
			ls.add(new Employee(3,"Neha",45000));
			
			System.out.println("Display collection without sorting");

			for(Employee e:ls) {
				System.out.println(e.getId()+"\t"+e.getName()+"\t"+e.getSalary());
			}
			
			Collections.sort(ls);
			System.out.println("Display collection with sorting");
			
			for(Employee e:ls) {
				System.out.println(e.getId()+"\t"+e.getName()+"\t"+e.getSalary());
			}

		}
		

}
