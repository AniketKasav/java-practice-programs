
import java.util.*;

public class sumOfAllNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Vector v=new Vector();
		System.out.println("Enter 5 integer ");
		for(int i=0;i<5;i++) {
			v.add(sc.nextInt());
		}
		int sum=0;
		for(Object obj:v) {
			sum+=(int)obj;
		}
		System.out.println("Sum : "+sum);
	}

}
