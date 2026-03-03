/*Q70. Write a java program to print this pattern.

	1
	A	B
	1	2	3
	A	B	C	D
	1	2	3	4	5    */
	
	
public class pattern70{
	public static void main(String[] args){
		for(int i=1;i<=5;i++){
			for(int j=1;j<=i;j++){
				System.out.print((i%2==1)?j+" ":(char)(j+64)+" ");
			}
			System.out.println();
		}
		
		
	}
}