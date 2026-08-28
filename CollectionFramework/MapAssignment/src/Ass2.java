//2.	Nested Map – Employee Department
//Create a Map<String, Map<Integer, String>> where the outer key represents a department 
//and the inner Map contains employee ID and employee name. 
//Write a program to display all employees department-wise. 
/*
Example
Employee Department
IT → {
    101: Rahul
    102: Priya
    103: Amit
}
HR → {
    201: Sneha
    202: Rohan
    203: Neha
}
Finance → {
    301: Karan
    302: Pooja
    303: Arjun
}
Displayed department-wise:
IT Department:
101 → Rahul
102 → Priya
103 → Amit

HR Department:
201 → Sneha
202 → Rohan
203 → Neha

Finance Department:
301 → Karan
302 → Pooja
303 → Arjun
*/

import java.util.*;


public class Ass2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		HashMap<String,HashMap<Integer,String>>mp=new HashMap<>();
		System.out.println("Enter the number of Department ");
		int n=sc.nextInt();
		sc.nextLine();
		for(int i=0;i<n;i++) {
			System.out.print("Enter department name :");
			String dept=sc.nextLine();
			HashMap<Integer,String>temp=new HashMap<>();
				System.out.println("Enter id and name :");
				int id=sc.nextInt();
				sc.nextLine();
				String name=sc.nextLine();
				temp.put(id, name);
				System.out.println("Enter id and name :");
				id=sc.nextInt();
				sc.nextLine();
				 name=sc.nextLine();
				temp.put(id, name);
				System.out.println("Enter id and name :");
				 id=sc.nextInt();
				sc.nextLine();
				 name=sc.nextLine();
				temp.put(id, name);
				
			mp.put(dept, temp);
			
		}
		
		System.out.println("\n=======OutPut=======");
		for(Map.Entry<String,HashMap<Integer,String>> Entry:mp.entrySet()) {
			String dpt=Entry.getKey();
			System.out.println(dpt+" Department :");
			for(Map.Entry<Integer,String> entry:Entry.getValue().entrySet()) {
				System.out.println(entry.getKey()+" -> "+entry.getValue());
			}
		}
	}

}










































