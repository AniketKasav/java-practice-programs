/*Question 7: Create a base class Patient with attributes name and age.
Create a child class InPatient that adds roomNumber.
Store details of 2 patients using an array of objects and display them.

Description
This assignment uses inheritance to extend patient details and stores multiple records
using an array of objects.

Input
Enter number of Patients: 2

Enter Name: Ravi
Enter Age: 45
Enter Room Number: 101

Enter Name: Meena
Enter Age: 30
Enter Room Number: 102
Output
Name: Ravi, Age: 45, Room No: 101
Name: Meena, Age: 30, Room No: 102 */

import java.util.Scanner;

class Patient{
	private String Name;
	private int age;
	
	void setName(String Name){
		this.Name=Name;
	}
	String getName(){
		return Name;
	}
	void setAge(int age){
		this.age=age;
	}
	int getAge(){
		return age;
	}
}

class InPatient extends Patient{
	private int roomNumber;
	
	void setRoomNumber(int roomNumber){
		this.roomNumber=roomNumber;
	}
	int getRoomNumber(){
		return roomNumber;
	}
	void display(){
		System.out.printf("Name: %s, Age: %d, Room No: %d %n",getName(),getAge(),getRoomNumber());
	}
}

public class Ass7{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter number of Patients: ");
		int n=sc.nextInt();
		sc.nextLine();
		InPatient[] ip=new InPatient[n];
		for(int i=0;i<n;i++){
			ip[i]=new InPatient();
			System.out.print("Enter Name :");
			ip[i].setName(sc.nextLine());
			System.out.print("Enter Age :");
			ip[i].setAge(sc.nextInt());
			System.out.print("Enter Room Number :");
			ip[i].setRoomNumber(sc.nextInt());
			sc.nextLine();
		}
		System.out.println();
		
		for(int i=0;i<n;i++){
			ip[i].display();
		}
	}
}
