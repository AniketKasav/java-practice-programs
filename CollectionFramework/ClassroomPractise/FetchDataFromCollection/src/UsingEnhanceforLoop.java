
import java.util.*;

public class UsingEnhanceforLoop {
	public static void main(String[] args) {
		Vector v=new Vector();
		v.add(10);
		v.add(53);
		v.add(58);
		v.add(99);
		v.add(100);
		
		for(Object obj:v) {
			System.out.println(obj);
		}
		
		
	}
}
