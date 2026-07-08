/*Question 3: Create a base class Student with attributes name and rollNo.
Create a child class Result that includes marks of 3 subjects.
Calculate total and percentage.

Description
This assignment demonstrates inheritance with calculation logic.
The child class uses parent data and extends it to compute academic results.

Input
Enter Name: Amit
Enter Roll No: 101
Enter Marks1: 80
Enter Marks2: 70
Enter Marks3: 90

Output
Name: Amit
Roll No: 101
Total Marks: 240
Percentage: 80.0%   */

import java.util.Scanner;

class Student{
	String name;
	int rollNo;
	
	void getStudInfo(Scanner sc){
		System.out.println("Enter the student name : ");
		name=sc.nextLine();
		System.out.println("Enter the Student roll no");
		rollNo=sc.nextInt();
	}
}

class Result extends Student{
	int sub1;
	int sub2;
	int sub3;
	int tmarks;
	float result;
	
	void getMarks(Scanner sc){
		System.out.println("Enter the marks of the three sub(math, eng, sci)");
		sub1=sc.nextInt();
		sub2=sc.nextInt();
		sub3=sc.nextInt();
		tmarks=sub1+sub2+sub3;
	}
	void getResult(){
		result=(tmarks)/3.0f;
	}
	
	void display(){
		System.out.println("Name :"+name);
		System.out.println("Roll No :"+rollNo);
		System.out.println("Total Marks :"+tmarks);
		System.out.printf("Percentage : %.1f%%",result);
	}
	
}

public class Ass3{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		Result r=new Result();
		r.getStudInfo(sc);
		r.getMarks(sc);
		r.getResult();
		r.display();
	}
}