//Q10. Create a Map<Integer, Teacher> where the Teacher ID is the key and the Teacher object is the value. 
//The Teacher class should contain Teacher Name and Salary.
//Perform the following operations: 
//	1. Create a Map<Integer, Teacher> and add multiple teacher records.  
//	2. Convert the Map values into a List<Teacher>.  
//	3. Sort the list of teachers based on Salary in ascending order using Comparable or Comparator.  
//	4. Display the sorted list of teachers. 

import java.util.*;

class Teacher implements Comparator<Teacher>{
	private String name;
	private int sal;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	@Override
	public int compare(Teacher o1, Teacher o2) {
		if(o1.getSal()>o2.getSal()) {
			return 1;
		}else if(o1.getSal()<o2.getSal()) {
			return -1;
		}else {
			return 0;
		}
		
	}
	
	
}

public class Q10 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of teachers");
		int n=sc.nextInt();
		sc.nextLine();
		HashMap<Integer,Teacher>mp=new HashMap<>();
		for(int i=0;i<n;i++) {
			System.out.println("Enter the name and salary ");
			Teacher t=new Teacher();
			t.setName(sc.next());
			t.setSal(sc.nextInt());
			sc.nextLine();
			mp.put(i,t);
		}
		List<Teacher> list = new ArrayList<>(mp.values());
		Teacher comparator = new Teacher();
		list.sort(comparator);
		System.out.println("Teachers sorted by salary:");
        for(Teacher t:list) {
            System.out.println(t.getName() + " " + t.getSal());
        }
		
	}

}

















