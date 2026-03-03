/*Q37. Check whether the month number is valid and display season.
 
    Input: 1 to 12
    Logic: if-else if to map to Winter/Summer/Monsoon (Rainy)/Autumn.
    Output: Season.  

winter = 12,1,2
Summer = 3,4,5
monsoon = 6,7,8,9
Autumn = 10,11

	*/

import java.util.*;
public class Ass37{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the month number : ");
		int m=sc.nextInt();
		
		if(m<=0 || m>12){
			System.out.print("Enter valid input ");
			return;
		}
		
		if(m==12 || m<3){
			System.out.print("Winter");
		}else if(m<6){
			System.out.print("Summer");
		}else if (m<10){
			System.out.print("Monsoon(Rainy)");
		}else{
			System.out.print("Autumn");
		}
		
		
		
	}
}	
