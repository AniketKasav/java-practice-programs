/*Q45.Chef is watching TV. The current volume of the TV is XX. Pressing the volume up button 
of the TV remote increases the volume by 11 while pressing the volume down button decreases the volume by 11.
The chef wants to change the volume from XX to YY. Find the minimum number of button presses required to do so.
Input Format
• 	The first line contains a single integer TT - the number of test cases. Then the test cases follow.
• 	The first and only line of each test case contains two integers XX and YY - the initial volume and final volume of the TV.
Output Format
For each test case, output the minimum number of times Chef has to press a button to change the volume from XX to YY.
Constraints
1<=T <=100
1<=X<=Y<=100
Input         	Output 2
50 54        	4
12 10        	2
 
Explanation:
Test Case 1: Chef can press the volume up button 4 times to increase the volume from 50 to 54.
Test Case 2: Chef can press the volume down button 2 times to decrease the volume from 12 to 10. */

import java.util.*;
public class Ass45{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the initial and final volume");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c;
		if(a<0||b<0){
			System.out.println("Invalid input ");
			return;
		}
		if(a>b){
			c=a-b;
			System.out.printf("Chef can press the volume down button %d times to decrease the volume from %d to %d",c,a,b);
		}else {
			c=b-a;
			System.out.printf("Chef can press the volume up button %d times to increase the volume from %d to %d",c,a,b);
		}
	}
}