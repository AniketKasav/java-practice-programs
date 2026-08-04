package Model;
import java.util.*;
public class PizzaRestaurant extends Restaurant{
	Scanner sc=new Scanner(System.in);
	public PizzaRestaurant(int restaurantId, String restaurantName, String location) {
		super(restaurantId, restaurantName, location);
		
	}
	
	@Override
	public void prepareFood() {
		System.out.println("Preparing pizza dough");
		System.out.println("Adding cheese and toppings");
		System.out.println("Baking the pizza");
		System.out.println("Pizza is ready !!!");
	}

	@Override
	public void calculateDeliveryCharges() {
		System.out.println("If distance <= 1 km ---> Free delivery");
		System.out.println("If distance > 1 km and <= 5 km --->  50Rs");
		System.out.println("If distance > 5 km --->  60Rs");
		System.out.println("Enter your distance(less than 1km then enter zero) :");
		int distance=sc.nextInt();
		while(distance<0) {
			System.out.println("Invalid distance ");
			System.out.println("Enter your distance :");
			distance=sc.nextInt();
			
		}
		if(distance<=1) {
			System.out.println("Free Delivery");
		}else if(distance<=5) {
			System.out.println("Delivery charges : 50Rs");
		}else {
			System.out.println("Delivery charges : 60Rs");
			
		}
	}

}
