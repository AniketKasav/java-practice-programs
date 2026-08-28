/*
4.	Nested Map – Update Value
Given a nested Map containing employee salaries department-wise, 
write a program to increase the salary of a particular employee by 10%. 

Example
Employee Salaries
IT → {
    Rahul → 50000
    Priya → 60000
}
HR → {
     Amit → 45000
     Neha → 55000
}

Suppose we want to increase Priya's salary by 10%.
Before:
Priya → 60000
After 10% increase:
Priya → 66000
So the updated map would be:

IT → {
    Rahul → 50000
     Priya → 66000
}

HR → {
    Amit → 45000
    Neha → 55000
}

*/



import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Ass4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		HashMap<String,HashMap<String,Integer>>mp=new HashMap<>();
		System.out.println("Enter the number of Department ");
		int n=sc.nextInt();
		sc.nextLine();
		for(int i=0;i<n;i++) {
			System.out.print("Enter department name :");
			String dept=sc.nextLine();
			HashMap<String,Integer>temp=new HashMap<>();
				System.out.println("Enter name and salary :");
				String name=sc.nextLine();
				int salary=sc.nextInt();
				sc.nextLine();
				temp.put(name,salary);
				System.out.println("Enter name and salary :");
				 name=sc.nextLine();
				 salary=sc.nextInt();
				sc.nextLine();
				temp.put(name, salary);
				
			mp.put(dept, temp);
			
		}
		
		System.out.println("Enter the Employee whose salary to increase :");
		String emp=sc.nextLine();
		
		for(String key:mp.keySet()) {
			HashMap<String,Integer>temp=mp.get(key);
			if(temp.containsKey(emp)) {
				float sal=(float)temp.get(emp);
				sal+=sal*0.1f;
				temp.put(emp, (int)sal);
			}
		}
		
		
		System.out.println("\n=======OutPut=======");
		for(Map.Entry<String,HashMap<String,Integer>> Entry:mp.entrySet()) {
			String dpt=Entry.getKey();
			System.out.println(dpt+" Department :");
			for(Map.Entry<String,Integer> entry:Entry.getValue().entrySet()) {
				System.out.println(entry.getKey()+" -> "+entry.getValue());
			}
		}
	}

}




























