/*Q79. Write a java program to print this pattern.

	A	B	C	D	E	D	C	B	A	
	A	B	C	D	  	D	C	B	A	
	A	B	C    			C	B	A
	A	B     					B	A
	A       						A
	A	B     					B	A
	A	B	C   			C	B	A
	A	B	C	D 		D	C	B	A
	A	B	C	D	E	D	C	B	A      */
	
	
	
public class pattern79{
	public static void main(String[] args){
		for(int i=1;i<=9;i++){
			char ch='A';
			for(int j=1;j<=9;j++){
				if((i<=5 && (j<=6-i || j>=4+i)) || (i>5 && (j<=i-4 || j>=14-i))){
					System.out.print(" "+ch+" ");
				}else{
					System.out.print("   ");
				}
				ch=(j<5)?++ch:--ch;
			}
			System.out.println();
		}	
	}
}