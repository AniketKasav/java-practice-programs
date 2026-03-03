/*Q40. Classify temperature reading: 
Input: Temperature in Celsius
Logic:
<0 → Freezing
0–20 → Cold
21–35 → Warm
35 → Hot
Output: Display weather type.*/

import java.util.*;

public class Ass40{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter temp in celsius : ");
		int t=sc.nextInt();
		
		if(t<0){
			System.out.print("weather type : Freezing");
		}else if(t<=20){
			System.out.print("weather type : Cold");
		}else if(t<=35){
			System.out.print("weather type : Warm");	
		}else{
			System.out.print("weather type : Hot");	
		}
	}
}