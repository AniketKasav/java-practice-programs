//Q11. Create a POJO class Student with fields:
//id
//name
//marks
//Store 5 students in a Vector and display students who scored more than 60 marks.
//Description
//Program should:
//Create Student class with getters/setters
//Store objects in Vector
//Apply condition marks > 60
//Display qualified students
//Input
//101 Rahul 55 
//102 Amit 78 
//103 Neha 88 
//104 Pooja 45 
//105 Kiran 67
//Output
//Students scoring above 60:
//
//102 Amit 78
//103 Neha 88
//105 Kiran 67

package DisplayStudentAbove60;
import java.util.*;

class Student{
	int id;
	String name;
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
	int marks;
	
}

public class DisplayStudent {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Vector<Object> v=new Vector<>();
		for(int i=0;i<5;i++) {
			System.out.println("Enter Id name and marks of the student "+(i+1));
			Student s=new Student();
			s.setId(sc.nextInt());
			sc.nextLine();
			s.setName(sc.nextLine());
			s.setMarks(sc.nextInt());
			v.add(s);
			
		}
		System.out.println("Students scoring above 60:");
		for(Object s:v) {
			Student s1=(Student)s;
			if(s1.getMarks()>60) {
			System.out.print(s1.getId()+"\t"+s1.getName()+"\t"+s1.getMarks()+"\n");
			}
		}
		
	}
}






























