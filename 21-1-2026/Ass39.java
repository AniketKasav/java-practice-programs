/*Q39. Calculate commission based on sales amount:
Input: Sales amount
Logic:
Sales < 5000 → 2% commission
Sales 5000–10000 → 5% commission
Sales > 10000 → 10% commission
Output: Display commission amount.*/

import java.util.*;

public class Ass39{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter sales amount : ");
		int sale=sc.nextInt();
		float cm=0;
		
		if(sale<=0){
			System.out.print("Invalid input plz enter valid sale amount !!");
			return;
		}
		
		if(sale<5000){
			cm=sale*0.02f;
		}else if (sale<=10000){
			cm=sale*0.05f;
		}else {
			cm=sale*0.1f;
		}
		System.out.printf("commission amount :%.2f",cm);
		
	}
}



