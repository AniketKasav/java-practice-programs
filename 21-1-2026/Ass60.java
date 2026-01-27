/*Q60. Create a Java program to simulate a basic food ordering system using switch:
 1: Burger
 2: Pizza
 3: Pasta
 4: Sandwich
 Display the price for the selected item.
Explanation: Switch on food item number. Print item name and price. Default for invalid selection.*/

import java.util.*;
public class Ass60{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int ch;
		
		do{
			System.out.print("Menu !!\n1: Burger\n2: Pizza\n3: Pasta\n4: Sandwich\n5: Exit ..\n");
			System.out.print("Enter your choice : ");
			ch=sc.nextInt();
			
			switch(ch){
				case 1:
					System.out.println("Burger price: 45₹");
					break;
				case 2:
					System.out.println("Pizza price: 150₹");
					break;
				case 3:
					System.out.println("Pasta price: 120₹");
					break;
				case 4:
					System.out.println("Sandwich price: 80₹");
					break;
				case 5:
					System.out.println("Thnku for using this service !!");
					break;
				default:
					System.out.println("Invalid choice !!");
				
			}
			
		}while(ch!=5);
		
		
		
	}
}