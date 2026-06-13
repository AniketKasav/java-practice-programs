/*Question 10: Write a Java program to implement a Student Grade Calculator.
Create a class StudentGrade with attributes name and marks.
Calculate grade based on marks:
- 80 to 100 => Grade A
- 60 to 79 => Grade B
- 40 to 59 => Grade C
- Below 40 => Fail
Asked In: Practice assignment
Run
Clear
Input:
Enter Name : Priya
Enter Marks : 67

Output:
Name : Priya
Marks : 67
Grade : B

Explanation:
A class StudentGrade is created with name and marks as instance variables.
An object is created and user inputs name and marks.
The grade is determined using an if-else ladder:
- marks >= 80 && marks <= 100 => Grade A
- marks >= 60 && marks <= 79 => Grade B
- marks >= 40 && marks <= 59 => Grade C
- marks < 40 => Fail
Since marks = 67 falls in the 60-79 range, the Grade is B.
This program models a real-world grading system using class objects.  */

import java.util.Scanner;
class StudentGrade{
	String name;
	int marks;
	StudentGrade(){
		name="";
		marks=0;
	}
	void identifyTriangle(){
		if(marks>=80){
			System.out.println("Grade A ");
			return;
		}
		if(marks>=60){
			System.out.println("Grade B");
	
		}else if(marks>=40){
			System.out.println("Grade C");
		
		}else{
			System.out.println(" Fail");
		}
	}
}

public class Ass10{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		StudentGrade g=new StudentGrade();
		System.out.print("Enter Name : ");
		g.name=sc.next();
		System.out.print("Enter Marks (out of 100):");
		g.marks=sc.nextInt();
		
		g.identifyTriangle();
	}
}
