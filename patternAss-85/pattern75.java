/*Q75. Write a java program to print this pattern.

A
A	B	A
A	B	C	B	A
A	B	C	D	C	B	A
A	B	C	D	E	D	C	B	A              */


public class pattern75{
	public static void main(String[] args){
		char ch;
		for(int i=0;i<5;i++){
			ch='A';
			for(int j=1;j<=2*i+1;j++){
				System.out.print(" "+ch+" ");
				ch=(j<=(2*i+1)/2?++ch:--ch);
			}
			System.out.println();
		}	
	}
}	