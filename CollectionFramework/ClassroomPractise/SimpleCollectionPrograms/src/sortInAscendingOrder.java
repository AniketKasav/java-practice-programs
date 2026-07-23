
import java.util.*;

public class sortInAscendingOrder {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Vector v=new Vector();
		System.out.println("Enter 5 integer");
		for(int i=0;i<5;i++) {
			v.add(sc.nextInt());
		}

		for(int i=0;i<v.size();i++) {
			for(int j=i+1;j<v.size();j++) {
				Object obj1=v.get(i);
				Object obj2=v.get(j);
				if((int)obj1>(int)obj2) {
					v.set(i, obj2);
					v.set(j, obj1);
				}
				
			}
			
		}
		System.out.println(v);
		
	}

}
