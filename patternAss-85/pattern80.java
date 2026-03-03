/*Q80. Write a java program to print this pattern.

	A
	B	C
	C		D
	D			E
	E	F	G	H	I              */
	
	
	
public class pattern80{
	public static void main(String[] args){
		for(int i=1;i<=5;i++){
			int n=i;
			for(int j=1;j<=5;j++){
				if(j==1 || i==5 || i==j){
				System.out.print(" "+(char)(n+64)+" ");
				n++;
				}else{
					System.out.print("   ");
				}
			}
			System.out.println();
		}	
	}
}