//Q20.Create Laptop class:
//id
//brand
//price
//Store laptops in Vector and display laptops of brand Dell.
//Description
//Logical condition:
//brand.equals("Dell")
//Input
//1 Dell 55000
//2 HP 60000
//3 Dell 72000
//4 Lenovo 50000
//Output
//Dell Laptops:
//
//1 Dell 55000
//3 Dell 72000

package DisplayLaptopOfDell;
import java.util.*;

class Laptop{
	int id;
	String brand;
	int price;
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
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
}

public class DisplayLaptop {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Vector<Object>v=new Vector<>();
		
		System.out.println("Enter number of the laptop");
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			System.out.println("Enter id brand and price of laptop");
			Laptop l=new Laptop();
			l.setId(sc.nextInt());
			sc.nextLine();
			l.setBrand(sc.nextLine());
			l.setPrice(sc.nextInt());
			v.add(l);
		}
		
		System.out.println("Dell Laptops:");
		for(Object obj:v) {
			Laptop l=(Laptop)obj;
			if(l.getBrand().equals("Dell") || l.getBrand().equals("dell")) {
				System.out.println(l.getId()+"\t"+l.getBrand()+"\t"+l.getPrice());
			}
		}
		
		
	}
}












