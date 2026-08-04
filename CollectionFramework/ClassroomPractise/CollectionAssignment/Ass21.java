/*Q21.Design a Java program to manage student records using a Vector collection and a POJO class Student. 
The program should allow the user to store and manage student details and 
perform multiple logical operations on the stored data.

Description
Create a POJO class Student with fields:
●	int id
●	String name
●	double marks
●	String course
Use a Vector<Student> to store student objects.

Operations to Perform (5 operations)
1.	Add Student records
2.	Display all students
3.	Search student by ID
4.	Find student with highest marks
5.	Count students enrolled in a particular course

Input Example
Enter number of students: 3

Enter Student Details:
101	Amit 78 Java
102	Neha 88 Python
103	Rahul 92 Java

Enter ID to search: 102

Enter course name: Java
 
Output Example
Student List:
101	Amit 78 Java
102	Neha 88 Python
103	Rahul 92 Java
Search Result:
102	Neha 88 Python
Highest Marks Student:
103	Rahul 92 Java
Total students in Java course: 2           */

import java.util.*;

class Student{
	int id;
	String name;
	int marks;
	String course;
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
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	
}


public class Ass21{
	public static void main(String[] args) {
		Vector<Student>v=new Vector<>();
		Scanner sc=new Scanner(System.in);
		
		do {
			System.out.println("1. Add Student records");
			System.out.println("2. Display all students");
			System.out.println("3. Search student by ID");
			System.out.println("4. Find student with highest marks");
			System.out.println("5. Count students enrolled in a particular course");
			System.out.println("6. exit");
			System.out.println("Enter your choice");
			int choice=sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Enter the number of students");
				int n=sc.nextInt();
				for(int i=0;i<n;i++) {
					Student s=new Student();
					System.out.println("Enter Student Details(id,name,marks,course):");
					s.setId(sc.nextInt());
					sc.nextLine();
					s.setName(sc.nextLine());
					s.setMarks(sc.nextInt());
					sc.nextLine();
					s.setCourse(sc.nextLine());
					v.add(s);
				}
				break;
			case 2:
				System.out.println("=============================================");
				System.out.println("id\tname\tmarks\tcourse");
				for(Student s:v) {
					System.out.println(s.getId()+"\t"+s.getName()+"\t"+s.getMarks()+"\t"+s.getCourse());
				}
				System.out.println("=============================================");
				break;
			case 3:
				System.out.println("Enter the id:");
				int id=sc.nextInt();
				for(Student s:v) {
					if(s.getId()==id) {
						System.out.println("=============================================");
						System.out.println(s.getId()+"\t"+s.getName()+"\t"+s.getMarks()+"\t"+s.getCourse());	
						System.out.println("=============================================");
					}
				}
				break;
			case 4:
				Student sh=new Student();
				int max=Integer.MIN_VALUE;
				for(Student s:v ){
					if(s.getMarks()>max) {
						sh=s;
						max=s.getMarks();
					}
				}
				System.out.println("=============================================");
				System.out.println("Highest Marks Student:");
				System.out.println(sh.getId()+"\t"+sh.getName()+"\t"+sh.getMarks()+"\t"+sh.getCourse());	
				System.out.println("=============================================");
				break;
			case 5:
				sc.nextLine();
				System.out.println("Enter the course name:");
				String cname=sc.nextLine();
				int count=0;
				for(Student s:v) {
					if(s.getCourse().equals(cname)) {
						count++;
					}
				}
				System.out.println("=============================================");
				System.out.printf("Total students in %s course: %d\n",cname,count);
				System.out.println("=============================================");
				break;
			case 6:
				System.out.println("Program Terminated");
				System.exit(0);
				break;
			default :
				System.out.println("Wrong choice");
			}
			
			
		}while(true);
	}
}








































