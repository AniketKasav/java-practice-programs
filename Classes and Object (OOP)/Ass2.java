/*Question 2: Write a Java program to implement a Number Checker.
Create a class NumberCheck with a variable number.
Check whether the number is Even or Odd using a class object.
Asked In: Practice assignment
Run
Clear
Input:
Enter Number : 45

Output:
Number : 45
Result : Odd Number

Explanation:
A class NumberCheck is created with an instance variable number.
An object of the class is created and the user enters a number using Scanner.
The condition used: if (number % 2 == 0) then Even, else Odd.
The modulo operator (%) gives the remainder when divided by 2.
Since 45 % 2 = 1 (not zero), the number is Odd.
If the user had entered 44, then 44 % 2 = 0, and it would print Even Number.
This program demonstrates class objects with basic arithmetic conditions.     */

import java.util.Scanner;
class NumberCheck{
	int num;
	NumberCheck(){
		num=0;
	}
	public void check(){
		System.out.println("Number : "+num);
		if(num%2==0){
			System.out.println("Result : Even Number");
		}else{
			System.out.println("Result : Odd Number");
		}
	}
}

public class Ass2{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		NumberCheck nc=new NumberCheck();
		System.out.print("Enter the number : ");
		nc.num=sc.nextInt();
		nc.check();
	}
}