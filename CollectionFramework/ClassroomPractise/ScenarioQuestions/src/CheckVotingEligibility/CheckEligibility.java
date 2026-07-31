//Q16.Create Customer class:
//id
//name
//age
//Store customers in Vector and display customers eligible for voting (age ≥18).
//Description
//Logical condition:
//age >= 18
//Input
//1 Ravi 17
//2 Meena 22
//3 Arjun 19
//4 Tina 15
//Output
//Eligible customers:
//
//2 Meena 22
//3 Arjun 19


package CheckVotingEligibility;
import java.util.*;


class Customer{
	int id;
	String name;
	int age;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}


public class CheckEligibility {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Vector<Object>v=new Vector<>();
		
		System.out.println("Enter the number of customer");
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			System.out.println("Enter the customer id name and age");
			Customer c=new Customer();
			c.setId(sc.nextInt());
			sc.nextLine();
			c.setName(sc.nextLine());
			c.setAge(sc.nextInt());
			v.add(c);
		}
		System.out.println("Eligible customers:");
		for(Object obj:v) {
			Customer c=(Customer)obj;
			if(c.getAge()>=18) {
				System.out.println(c.getId()+"\t"+c.getName()+"\t"+c.getAge()+"\t");
			}
			
		}
		
	}

}


















