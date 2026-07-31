//Q13.Create Product class:
//productId
//productName
//price
//Store products in Vector and display products with price less than 500.
//Description
//Check condition:
//price < 500
//Input
//P1 Mouse 450
//P2 Keyboard 700
//P3 PenDrive 350
//P4 Monitor 9000
//Output
//Products below 500:
//
//P1 Mouse 450
//P3 PenDrive 350

package DisplayProduct;
import java.util.*;

class Product{
	int productId;
	String productName;
	int price;
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}	
}

public class DisplayProduct {
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the number of products");
			int n=sc.nextInt();
			Vector<Object>v=new Vector<>();
			
			for(int i=0;i<n;i++) {
				System.out.println("Enter product id name and price");
				Product p=new Product();
				p.setProductId(sc.nextInt());
				sc.nextLine();
				p.setProductName(sc.nextLine());
				p.setPrice(sc.nextInt());
				v.add(p);
			}
			Iterator<Object>it=v.iterator();
			System.out.println("Products below 500:");
			while(it.hasNext()) {
				Product p=(Product)it.next();
				if(p.getPrice()<500) {
					System.out.println(p.getProductId()+"\t"+p.getProductName()+"\t"+p.getPrice()+"\n");
				}
			}
		}
}





















