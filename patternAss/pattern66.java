/*Q66. Write a java program to print this pattern.

						A
					B	A
				C	B	A
			D	C	B	A
		E	D	C	B	A         */
		
		
public class pattern66{
	public static void main(String[] args){
		for(int i=1;i<=5;i++){
			for(int j=1;j<=5;j++){
				if(j<=5-i){
					System.out.print("   ");
				}else{
					System.out.print(" "+(char)(70-j)+" ");
				}
			}
			System.out.println();
		}
		
		
	}
}