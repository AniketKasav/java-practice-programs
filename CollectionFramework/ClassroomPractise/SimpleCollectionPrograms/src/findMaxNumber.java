import java.util.*;

public class findMaxNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Vector v=new Vector();
		System.out.println("Enter 5 integer");
		for(int i=0;i<5;i++) {
			v.add(sc.nextInt());
		}
		
		int max=(int)v.get(0);
		for(int i=1;i<v.size();i++) {
			int num=(int)v.get(i);
			if(max<num) {
				max=num;
			}
		}
		
		System.out.println("Maximum : "+max);
	}
}
