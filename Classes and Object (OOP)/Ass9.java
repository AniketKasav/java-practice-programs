/*Question 9: Write a Java program to implement a Triangle Type Identifier.
Create a class Triangle with attributes side1, side2, side3.
Identify triangle type:
- All sides equal => Equilateral
- Two sides equal => Isosceles
- All sides different => Scalene
Asked In: Practice assignment
Run
Clear
Input:
Enter Side1 : 5
Enter Side2 : 5
Enter Side3 : 5

Output:
Triangle Type : Equilateral Triangle

Explanation:
A class Triangle is created with three instance variables: side1, side2, side3.
User enters all three side values.
Conditions used:
- if (side1 == side2 && side2 == side3) => Equilateral Triangle
- else if (side1 == side2 || side2 == side3 || side1 == side3) => Isosceles Triangle
- else => Scalene Triangle
Since all three sides are 5, the condition side1 == side2 == side3 is true.
Output: Equilateral Triangle
This program demonstrates logical AND and OR operators with class objects.*/

import java.util.Scanner;
class Triangle{
	int Side1;
	int Side2;
	int Side3;
	Triangle(){
		Side1=0;
		Side2=0;
		Side3=0;
	}
	void identifyTriangle(){
		
		if(Side1==Side2 && Side2==Side3){
			System.out.println("Equilateral Triangle");
	
		}else if(Side1==Side2 || Side2==Side3 || Side1==Side3){
			System.out.println("Isosceles Triangle");
		
		}else{
			System.out.println(" Scalene Triangle");
		}
	}
}

public class Ass9{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		Triangle t=new Triangle();
		System.out.print("Enter Side1 :");
		t.Side1=sc.nextInt();
		System.out.print("Enter Side2 :");
		t.Side2=sc.nextInt();
		System.out.print("Enter Side2 :");
		t.Side3=sc.nextInt();
		
		t.identifyTriangle();
	}
}
