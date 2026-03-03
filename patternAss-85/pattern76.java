/*Q76. Write a java program to print this pattern.

A
1	2	1
A	B	C	B	A
1	2	3	4	3	2	1
A	B	C	D	E	D	C	B	A         */

public class pattern76{
	public static void main(String[] args){
		int n;
		for(int i=0;i<5;i++){
			n=1;
			for(int j=1;j<=2*i+1;j++){
				if(i%2==1){
					System.out.print(" "+n+" ");
					n=(j<=(2*i+1)/2?++n:--n);
				}else{
				System.out.print(" "+(char)(n+64)+" ");
				n=(j<=(2*i+1)/2?++n:--n);
				}
			}
			System.out.println();
		}	
	}
}