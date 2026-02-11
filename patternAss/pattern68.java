/*Q68. Write a java program to print this pattern.

	A		B		C		D		E
	     A	     B	     C        D
			A		B		C
				A	     B
					A                         */
					
					
					
public class pattern68{
	public static void main(String[] args){
		char ch;
		for(int i=5;i>=1;i--){
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
