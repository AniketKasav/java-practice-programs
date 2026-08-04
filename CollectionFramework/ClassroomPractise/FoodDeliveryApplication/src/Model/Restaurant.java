package Model;

public abstract class Restaurant {
		
		int restaurantId;
		String restaurantName;
		String location;
		
		Restaurant(int restaurantId,String restaurantName,String location){
			this.restaurantId=restaurantId;
			this.restaurantName=restaurantName;
			this.location=location;
		}
		
		public final void companyLogo() {
			System.out.println("***** FoodExpress *****\r\n"
					+ "	Welcome to FoodExpress\r\n"
					+ "	Powered by Food Delivery Company\r\n"
					+ "	=== XYZ Food Delivery ===\r\n");
		}
		
		public abstract void prepareFood();
		public abstract void calculateDeliveryCharges();
	

}
