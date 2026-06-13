/*Question 6: Write a Java program to implement a Product Discount System.
Create a class Product with attributes productId, name, and price.
Apply discount based on price:
- Price > 5000 => 20% Discount
- Price 2000 to 5000 => 10% Discount
- Price < 2000 => No Discount
Display the final price after discount.
Asked In: Practice assignment
Run
Clear
Input:
Enter Product Id : 101
Enter Product Name : Headphones
Enter Price : 6000

Output:
Product Id : 101
Product Name : Headphones
Original Price : 6000
Discount : 20%
Final Price : 4800

Explanation:
A class Product is created with productId, name, and price.
The discount logic:
- price > 5000 => 20% discount => Final Price = price - (price * 20 / 100)
- price >= 2000 && price <= 5000 => 10% discount
- price < 2000 => No discount
Since price = 6000 (greater than 5000):
Discount = 6000 * 20 / 100 = 1200
Final Price = 6000 - 1200 = 4800
This program teaches percentage calculation and conditional discounting. */

import java.util.Scanner;
class Product{
	int productId;
	String name;
	int price;
	Product(){
		productId=0;
		name="";
		price=0;
	}
	void applyDiscount(){
		System.out.println("Product Id : "+productId);
		System.out.println("Product Name : "+name);
		System.out.println("Original Price : "+price);
		System.out.print("Discount : ");
		float dic=0.0f;
		if(price>5000){
			System.out.println("20%");
			dic=0.2f;
		}else if(price>=2000){
			System.out.println("10%");
			dic=0.1f;
		}else{
			System.out.println("No Discount");
		}
		int fp=(int)(price-price*dic);
		System.out.println("Final Price : "+fp);
	}
}

public class Ass6{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		Product p=new Product();
		System.out.print("Enter Product Id :");
		p.productId=sc.nextInt();
		System.out.print("Enter Product Name :");
		p.name=sc.next();
		System.out.print("Enter Price :");
		p.price=sc.nextInt();
		
		p.applyDiscount();
	}
}
