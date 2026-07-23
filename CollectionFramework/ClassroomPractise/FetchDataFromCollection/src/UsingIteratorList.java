
import java.util.*;

public class UsingIteratorList {
	public static void main(String[] args) {
		
		Vector v=new Vector();
		v.add(10);
		v.add(20);
		v.add(30);
		v.add(40);
		v.add(50);
		
		System.out.println(v);
		ListIterator li=v.listIterator(2);
		
		while(li.hasNext()){
			Object obj=li.next();
			System.out.print(obj+" ");
		}
	
		System.out.println();
		System.out.println(li.nextIndex());
		System.out.println(li.previousIndex());
		while(li.hasPrevious()){
			Object obj=li.previous();
			if((int)obj==30) {
				li.set(300);
			}
			if((int)obj==40) {
				li.add(99);
			}
			if((int)obj==20) {
				li.remove();
			}
			System.out.print(obj+" ");
		}
		System.out.println("\n"+v);
		
	}
}
