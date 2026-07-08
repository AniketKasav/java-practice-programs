/*Question 2: Create a base class Vehicle with attributes brand and speed.
Create a child class Car that adds fuelType.
Display all details using inheritance.

Description
This program shows how a child class accesses parent properties and adds its own features.
Useful to understand data reuse using inheritance.

Input
Enter Brand: Toyota
Enter Speed: 120
Enter Fuel Type: Petrol

Output
Brand: Toyota
Speed: 120 km/h
Fuel Type: Petrol   */

import java.util.Scanner;

class Vehicle{
	String brand;
	int speed;
	static Scanner sc = new Scanner(System.in);
	void getVehicleInfo(){
		//Scanner sc=new Scanner(System.in);
		System.out.println("Enter the brand name :");
		brand=sc.nextLine();
		System.out.println("Enter the speed (km/h):");
		speed=sc.nextInt();
		sc.nextLine();
	}
}

class Car extends Vehicle{
	String fuelType;
	
	void getCarInfo(){
		//Scanner sc=new Scanner(System.in);
		System.out.println("Enter the fule type :");
		fuelType=sc.nextLine();
	}
	
	void display(){
		System.out.println("Brand: "+brand);
		System.out.println("Speed: "+speed);
		System.out.println("Fuel Type: "+fuelType);
	}
}

public class Ass2{
	public static void main(String [] args){
		//Scanner sc=new Scanner(System.in);
		Car c=new Car();
		c.getVehicleInfo();
		c.getCarInfo();
		c.display();
	}
}