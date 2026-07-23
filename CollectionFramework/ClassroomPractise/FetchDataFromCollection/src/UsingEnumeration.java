import java.util.*;

public class UsingEnumeration {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Vector v=new Vector();
		System.out.println("Enter 5 integer :");
		for(int i=0;i<5;i++) {
			v.add(sc.nextInt());
		}
		
		Enumeration em=v.elements();
		while(em.hasMoreElements()) {
			Object obj=em.nextElement();
			System.out.println(obj);
		}
			
	}

}
