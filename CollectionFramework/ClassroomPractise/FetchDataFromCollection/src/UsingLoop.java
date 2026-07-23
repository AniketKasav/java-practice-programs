import java.util.*;

public class UsingLoop {

	public static void main(String[] args) {
		Vector v=new Vector();
		v.add(10);
		v.add(20);
		v.add(300);
		v.add(50);
		v.add(55);
		for(int i=0;i<v.size();i++){
			Object obj=v.get(i);
			System.out.println(obj);
		}
	}

}