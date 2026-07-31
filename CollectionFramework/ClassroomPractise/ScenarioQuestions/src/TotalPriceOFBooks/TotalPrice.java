//Q15.Create Book class:
//bookId
//bookName
//price
//Store books in Vector and calculate total price of all books.
//Description
//Logical operation:
//total = total + price
//Input
//1 Java 500
//2 SQL 350
//3 Python 400
//Output
//Total Book Price = 1250

package TotalPriceOFBooks;
import java.util.*;

class Book{
	int bookId;
	String bookName;
	int price;
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
}


public class TotalPrice {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of books");
		int n=sc.nextInt();
		Vector<Object>v=new Vector<>();
		for(int i=0;i<n;i++) {
			System.out.println("Enter id name and price of a book");
			Book b=new Book();
			b.setBookId(sc.nextInt());
			sc.nextLine();
			b.setBookName(sc.nextLine());
			b.setPrice(sc.nextInt());
			v.add(b);
		}
		
		
		int totalPrice=0;
		for(Object obj: v) {
			Book b=(Book)obj;
			totalPrice+=b.getPrice();
		}
		
		System.out.println("Total Book Price ="+totalPrice);

	}

}




















