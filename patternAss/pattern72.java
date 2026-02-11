/*Q72. Write a java program to print this pattern.

				1
			A	B	C
		2	3	4	5	6
	D	E	F	G	H	I	J
7	8	9	10	11	12	13	14	15     */


public class pattern72{
	public static void main(String[] args){
		int n=1;
		char ch='A';
		for(int i=1;i<=5;i++){
			for(int j=1;j<=9;j++){
				if(j>=6-i && j<=4+i){
				if(i%2==1){
					System.out.print(" "+n+" ");
					n++;
				}else{
					System.out.print(" "+ch+" ");
					ch++;
				}
				}else{
					System.out.print("   ");
				}
			}
			System.out.println();
		}
		
		
	}
}