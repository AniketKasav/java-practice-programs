//Q29. Write a java program to input electricity unit charges & calculate total electricity bill according to the given condition
//              	For first 50 units Rs. 0.50/unit
//              	For next 100 units Rs. 0.75/unit
//              	For next 100 units Rs. 1.20/unit
//              	For unit above 250 Rs. 1.50/unit
//An additional surcharge of 20% is added to the bill.

import java.util.Scanner;

public class Ass29{
	public static void main(String[] args){
		System.out.print("Enter the Ele Units : ");
		Scanner sc=new Scanner(System.in);
		int units=sc.nextInt();
		float charges;
		if(units <=50){
			charges=units*0.50f;
		}else if (units <=150){
			charges=50*0.50f;
			charges+=(units-50)*0.75f;
			
		}else if(units<=250){
			charges=50*0.50f;
			charges+=100*0.75f;
			charges+=(units-150)*1.20f;
		}else{
			charges=50*0.50f;
			charges+=100*0.75f;
			charges+=100*1.20f;
			charges+=(units-250)*1.50f;
		}
		float surcharge=charges*0.20f;
		float totalBill=charges+surcharge;
		
		System.out.printf("Electricity Bill = Rs.%.2f.",totalBill);
		
	}
}