/*Question 7: Write a Java program to implement an Electricity Bill Calculator.
Create a class ElectricityBill with attributes customerId, name, and units.
Calculate bill using slabs:
- First 100 units => Rs.5 per unit
- Next 100 units => Rs.7 per unit
- Above 200 units => Rs.10 per unit
Display total bill.
Asked In: Practice assignment
Run
Clear
Input:
Enter Customer Id : 301
Enter Name : Suresh
Enter Units : 250

Output:
Customer Id : 301
Name : Suresh
Units : 250
Total Bill : Rs. 1850

Explanation:
A class ElectricityBill is created with customerId, name, and units.
Bill is calculated in slabs:
- First 100 units : 100 * 5 = 500
- Next 100 units : 100 * 7 = 700
- Remaining units : (250 - 200) = 50 units * 13 = 650
- Total Bill = 500 + 700 + 650 = 1850
The if-else conditions check: if units > 200, add slabs progressively.
This program demonstrates tiered calculation logic with class objects.   */

import java.util.Scanner;
class ElectricityBill{
	int customerId;
	String name;
	int units;
	ElectricityBill(){
		customerId=0;
		name="";
		units=0;
	}
	void bill(){
		System.out.println("Customer Id :"+customerId);
		System.out.println("Name : "+name);
		System.out.println("Units : "+units);
		int totalbill=0;
		if(units<=100){
			totalbill=units*5;
		}else if(units<=200){
			totalbill=(100*5)+(units-100*7);
		}else{
			totalbill=(100*5)+(units-100*7)+(units-200*13);
		}
		System.out.println("Total Bill : "+totalbill);
	}
}

public class Ass7{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		ElectricityBill p=new ElectricityBill();
		System.out.print("Enter Customer Id :");
		p.customerId=sc.nextInt();
		System.out.print("Enter Name :");
		p.name=sc.next();
		System.out.print("Enter Units :");
		p.units=sc.nextInt();
		
		p.bill();
	}
}


