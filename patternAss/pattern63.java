/*Q63. Write a java program to print this pattern.

	A	B	C	D	E
	B	C	D	E	F
	C	D	E	F	G
	D	E	F	G	H
	E	F	G	H	I                 */
	
public class pattern63{
	public static void main(String[] args){	
	int n;
		for(int i=1;i<=5;i++){
			n=i;
			for(int j=1;j<=5;j++){
				System.out.print((char)(n+64)+"  ");
				n++;
			}
			System.out.println();
		}
		
		
	/*	char ch;
		for(int i=0;i<5;i++){
			ch=(char)('A'+i);
			for(int j=1;j<=5;j++){
				System.out.print(ch+"  ");
				ch++;
			}
			System.out.println();
		}   */
		
	}
}