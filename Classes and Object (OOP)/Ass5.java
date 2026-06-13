/*Question 5: Write a Java program to implement a Temperature Checker.
Create a class Temperature with attribute temp.
Check the weather condition:
- temp > 35 => Hot
- temp 20 to 35 => Normal
- temp < 20 => Cold
Asked In: Practice assignment
Run
Clear
Input:
Enter Temperature : 18

Output:
Temperature : 18
Weather : Cold

Explanation:
A class Temperature is created with an instance variable temp.
The user enters a temperature value via Scanner.
An if-else ladder checks the range:
- temp > 35 => Hot
- temp >= 20 && temp <= 35 => Normal
- temp < 20 => Cold
Since 18 < 20, the weather condition is Cold.
If temp = 30, it would print Normal. If temp = 40, it would print Hot.
This demonstrates multi-range conditional logic using class objects.   */

import java.util.Scanner;
class Temperature{
	int temp;
	Temperature(){
		temp=0;
	}
	
	void checkWeather(){
		System.out.println("Temperature : "+temp);
		System.out.print("Weather : ");
		if(temp>35){
			System.out.print("Hot");
		}else if(temp>=20){
			System.out.print("Normal");
		}else{
			System.out.print("Cold");	
		}
	}
}

public class Ass5{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		Temperature t=new Temperature();
		System.out.println("Enter Temperature :");
		t.temp=sc.nextInt();
		t.checkWeather();
	}
}
