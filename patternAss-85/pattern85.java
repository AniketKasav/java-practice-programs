/*Q85. Write a java program to print this pattern.


	D
	D	C
	D	C	B
	D	C	B	A
	D	C	B
	D	C
	D                 */
	
	
public class pattern85{
	public static void main(String[] args){
		
		for(int i=1;i<=7;i++){
			char ch='D';
			for(int j=1;j<=4;j++){
				if((i<=4 && j<=i)||(i>4 && j<=8-i)){
					System.out.print(" "+ch+" ");
					ch--;					
				}else{
					System.out.print("   ");
				}
			}
			System.out.println();
		}	
	}
}