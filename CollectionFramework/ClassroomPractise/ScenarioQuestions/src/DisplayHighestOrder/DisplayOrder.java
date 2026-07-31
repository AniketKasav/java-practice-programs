//Q19.Create Order class:
//orderId
//customerName
//amount
//Store orders in Vector and find highest order amount.
//Description
//Logic:
//if(amount > max)
//max = amount;
//Input
//1 Ram 2500
//2 Sita 4200
//3 Mohan 3100
//Output
//Highest Order Amount = 4200

package DisplayHighestOrder;
import java.util.*;

class Order{
	int id;
	String customerNmae;
	int amount;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCustomerNmae() {
		return customerNmae;
	}
	public void setCustomerNmae(String customerNmae) {
		this.customerNmae = customerNmae;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
}


public class DisplayOrder {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Vector<Object>v=new Vector<>();
		System.out.println("Enter number of Customers");
		int n=sc.nextInt();
		
		for(int i=0;i<n;i++) {
			Order o=new Order();
			System.out.println("Enter id CustomerName and amount");
			o.setId(sc.nextInt());
			sc.nextLine();
			o.setCustomerNmae(sc.nextLine());
			o.setAmount(sc.nextInt());
			v.add(o);
		}
		ListIterator ls=v.listIterator();
		int maxAmount=Integer.MIN_VALUE;
		
		while(ls.hasNext()) {
			Order o=(Order)ls.next();
			if(o.getAmount()>maxAmount) {
				maxAmount=o.getAmount();
			}
		}
		System.out.println("Highest Order Amount = "+maxAmount);
	}
}





















