/*Q42. Mobile plan billing system:
Input: Minutes used in a month
Logic:
Up to 100 mins → Base ₹199
101–300 mins → ₹199 + ₹1/min for extra
301–500 mins → ₹199 + ₹1.5/min for extra
Above 500 mins → ₹199 + ₹2/min for extra
Output: Total monthly bill.*/


import java.util.*;
public class Ass42{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the min used in month : ");
		int min=sc.nextInt();
		float bill=199;
		
		if(min<=100){
			bill=199;
		}else if(min<=300){
			bill=199+(min-100)*1.0f;
		}else if(min<=500){
			bill=199+200*1.0f+(min-300)*1.5f;
		}else{
			bill=199+200*1.0f+200*1.5f	+(min-500)*2.0f;
		}
		
		System.out.printf("Total monthly bill : %.2f",bill);
		
	}
}
