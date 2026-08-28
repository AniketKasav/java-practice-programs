//Q21.Problem Statement
// Create a Student class with fields id, name, and marks.
// Store Student objects in an ArrayList and count students whose marks are greater than 70.
//Input:
// (1,Ram,75)
// (2,Sam,65)
// (3,Amit,90)
//Output:
// Count: 2

import java.util.*;

class Student{
	int id;
	String name;
	int marks;
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
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	
}

public class Ass21 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<Student> ls =new ArrayList<Student>();
		
		System.out.println("Enter the number of students");
		int n=sc.nextInt();
		System.out.println("Enter student details ");
		for(int i=0;i<n;i++) {
			Student st=new Student();
			System.out.print("Enter id :");
			int id=sc.nextInt();
			st.setId(id);
			sc.nextLine();
			System.out.print("Enter name :");
			String name=sc.nextLine();
			st.setName(name);
			System.out.print("Enter marks");
			int marks=sc.nextInt();
			st.setMarks(marks);
			ls.add(st);
		}
		int count=0;
		System.out.println("count students whose marks are greater than 70.");
		for(Student s:ls) {
			if(s.getMarks()>70) {
				count++;
			}
		}
		System.out.println("Count :"+count);
		
	}
}



















