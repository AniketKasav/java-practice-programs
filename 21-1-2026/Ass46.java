/*Q46. Pooja would like to withdraw X $US from an ATM. The cash machine will only accept the transaction
 if X is a multiple of 5, and Pooja's account balance has enough cash to perform the withdrawal 
 transaction (including bank charges). For each successful withdrawal the bank charges 0.50 $US.
Calculate Pooja's account balance after an attempted transaction.
Input
Positive integer 0 < X <= 2000 - the amount of cash which Pooja wishes to withdraw. Nonnegative number 0<= Y <= 2000
 with two digits of precision - Pooja's initial account balance. Output
Output the account balance after the attempted transaction, given as a number with two digits of precision. 
If there is not enough money in the account to complete the transaction, output the current bank balance.
Example - Successful Transaction Input:
30 120.00
Output:
89.50
Example - Incorrect Withdrawal Amount (not multiple of 5) Input:
42 120.00
Output:
120.00
Example - Insufficient Funds Input:
300 120.00
Output:
120.00*/

import java.util.*;
public class Ass46{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the amount of cash which Pooja wishes to withdraw :");
		float cash=sc.nextFloat();
		System.out.println("Enter Pooja's initial account balance :");
		float bal=sc.nextFloat();
		
		if(cash%5==0&&cash+0.50<=bal){
			bal=bal-(cash+0.50f);
		}
		
		System.out.println(bal);
		
		
		
		
	}
}
