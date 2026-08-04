package Model;
import java.util.*;
public class CreditCard implements Payment{
	
	Scanner sc=new Scanner(System.in);
	
	@Override
	public void pay() {
		System.out.println("Enter Card Number:");
		String cardNo=sc.nextLine();
		System.out.println("Enter CVV:");
		String cvv=sc.nextLine();
		while(cardNo.length()==0 || cvv.length()==0) {
			System.out.println("Enter valid details");
			System.out.println("Enter Card Number:");
			cardNo=sc.nextLine();
			System.out.println("Enter CVV:");
			cvv=sc.nextLine();
		}
		
		System.out.println("Processing payment....");
		System.out.println("Payment successfull");
	}
}
