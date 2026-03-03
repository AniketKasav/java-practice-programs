/*Q62. Write a java program to print this pattern.

A	B	C	D	E
A	B	C	D	E
A	B	C	D	E	
A	B	C	D	E
A	B	C	D	E           */



public class pattern62{
	public static void main(String[] args){
		for(int i=1;i<=5;i++){
			for(int j=1;j<=5;j++){
				System.out.print((char)(j+64)+"  ");
			}
			System.out.println();
		}
		
		
	}
}