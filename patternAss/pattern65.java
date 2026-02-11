/*Q65. Write a java program to print this pattern.

	E	E	E	E	E
	D	D	D	D
	C	C	C
	B	B
	A                           */
	
	
public class pattern65{
	public static void main(String[] args){
		for(int i=5;i>=1;i--){
			for(int j=1;j<=i;j++){
				System.out.print((char)(i+64)+"  ");
			}
			System.out.println();
		}
		
		
	}
}