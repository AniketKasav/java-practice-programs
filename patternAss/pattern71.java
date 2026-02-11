/*Q71. Write a java program to print this pattern.

	1	A	2	B	3
	C	4	D	5	E
	6	F	7	G	8
	H	9	I	10	J
	11	K	12	L	13          */
	
public class pattern71{
	public static void main(String[] args){
		int n=1;
		char ch='A';
		for(int i=1;i<=5;i++){
			for(int j=1;j<=5;j++){
				if((i+j)%2==0){
					System.out.print(n+" ");
					n++;
				}else{
					System.out.print(ch+" ");
					ch++;
				}
			}
			System.out.println();
		}
		
		
	}
}