/*Q67. Write a java program to print this pattern.

				A
			A		B
		A		B		C
	A	    B	    C	     D
A		B		C		D		E   */

public class pattern67{
	public static void main(String[] args){
		char ch;
		for(int i=1;i<=5;i++){
			ch='A';
			for(int j=1;j<=9;j++){
				if((i+j)%2==0 && j>=6-i && j<=4+i){
					System.out.print(" "+ch+" ");
					ch++;
				}else{
					System.out.print("   ");
				}
			}
			System.out.println();
		}
		
		
	}
}