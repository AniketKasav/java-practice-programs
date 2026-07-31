//Q17.Create Mobile class:
//id
//brand
//quantity
//Store mobiles in Vector and display mobiles with stock less than 10.
//Description
//Condition:
//quantity < 10
//Input
//1 Samsung 15
//2 Vivo 8
//3 Oppo 5
//4 Apple 20
//Output
//Low Stock Mobiles:
//
//2 Vivo 8
//3 Oppo 5

package DisplayMobileWithStock;
import java.util.*;

class Mobile{
	int id;
	String brand;
	int quantity;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
}

public class DisplayMobile {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Vector<Object>v=new Vector<>();
		
		System.out.println("Enter number of Mobile brand");
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			System.out.println("Enter id brand and price of mobile");
			Mobile m=new Mobile();
			m.setId(sc.nextInt());
			sc.nextLine();
			m.setBrand(sc.nextLine());
			m.setQuantity(sc.nextInt());
			v.add(m);
		}
		System.out.println("Low Stock Mobiles:");
		for(Object obj:v) {
			Mobile m=(Mobile)obj;
			if(m.getQuantity()<10) {
				System.out.println(m.getId()+"\t"+m.getBrand()+"\t"+m.getQuantity()+"\n");
			}
		}
		
	}
}

















