package Model;
import java.util.*;
public class UPI implements Payment{

	Scanner sc=new Scanner(System.in);
	
	@Override
	public void pay() {
		System.out.println("Enter UPI id ");
		String upiId=sc.nextLine();
		System.out.println("Enter PIN");
		String pin=sc.nextLine();
		while(upiId.length()==0 || pin.length()==0) {
			System.out.println("Enter valid details");
			System.out.println("Enter UPI id ");
			 upiId=sc.nextLine();
			System.out.println("Enter PIN");
			 pin=sc.nextLine();
		}
		
		System.out.println("Processing payment....");
		System.out.println("Payment successfull");
	}

}
