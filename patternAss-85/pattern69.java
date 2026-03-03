/*Q69. Write a java program to print this pattern.
	
	A	1	2	3	4
	A	B	1	2	3
	A	B	C	1	2
	A	B	C	D	1
	A	B	C	D	E     */
	
	
	
public class pattern69{
	public static void main(String[] args){
		for(int i=1;i<=5;i++){
			for(int j=1;j<=5;j++){
				if(j<=i){
					System.out.print(" "+(char)(j+64)+" ");
				}else{
					System.out.print(" "+(j-i)+" ");
				}
			}
			System.out.println();
		}	
	}
}