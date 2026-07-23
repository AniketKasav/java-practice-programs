import java.util.*;

public class UsingIterator {
	public static void main(String[] args) {
		Vector v=new Vector();
		v.add(10);
		v.add(20);
		v.add(30);
		v.add(40);
		v.add(50);
		Iterator it=v.iterator();
		while(it.hasNext()) {
			Object obj=it.next();
			if((int)obj==20) {
				it.remove();
			}
			System.out.println(obj);
		}
		System.out.println(v);
	}
}
