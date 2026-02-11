/*Q64. Write a java program to print this pattern.

	A
	B	B
	C	C	C	
	D	D	D	D
	E	E	E	E	E             */
	
	
public class pattern64{
	public static void main(String[] args){
		for(int i=1;i<=5;i++){
			for(int j=1;j<=i;j++){
				System.out.print((char)(i+64)+"  ");
			}
			System.out.println();
		}	
	}
}