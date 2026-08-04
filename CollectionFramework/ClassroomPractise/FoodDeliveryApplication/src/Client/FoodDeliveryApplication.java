//2. Food Delivery Application
//A food delivery company supports different restaurants.
//Requirements:
//•	Create an abstract class Restaurant. 
//•	Create child classes PizzaRestaurant, ChineseRestaurant, and SouthIndianRestaurant. 
//•	Every restaurant prepares food differently. 
//•	Delivery charges should be calculated differently. 
//•	Payment should support multiple methods like UPI, Credit Card, and Cash on Delivery. 
//•	The company logo method should never be overridden. 
//•	Use a parent reference to invoke child methods. 
//•	Initialize restaurant details using the parent constructor. 
//Implement using:
//•	Inheritance 
//•	Abstract Class 
//•	Interface 
//•	Overriding 
//•	Dynamic Polymorphism 
//•	super() Constructor 
//•	final Method 
//•	Loose Coupling 




package Client;
import java.util.*;

import Model.PizzaRestaurant;
import Model.Restaurant;
public class FoodDeliveryApplication {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int choice=0;
		do {
			System.out.println("1. PizzaRestaurant");
			System.out.println("2. ChineseRestaurant");
			System.out.println("3. SouthIndianRestaurant");
			System.out.println("3. Exit");
			System.out.println("Enter your choice");
			choice=sc.nextInt();
			
			switch(choice) {
			case 1:
				Restaurant r=new PizzaRestaurant(1,"Dominoz","Pune");
				System.out.println("you want to place an order?\n1. Yes\n2. No");
				System.out.println("Enter option number:");
				int ch=sc.nextInt();
				if(ch==1) {
				r.companyLogo();
				r.prepareFood();
				r.calculateDeliveryCharges();
				}else {
					System.out.println("Thank you for visiting FoodExpress!");
				}
				break;
			
			case 2:
				break;
				
			case 3:
				break;
			case 4:
				System.exit(0);
			default :
				System.out.println("Invalid choice try again");
			}
		}while(choice !=4);
		
	}
}






















