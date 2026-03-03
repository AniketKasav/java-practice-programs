/*Q81. Write a java program to print this pattern.

	A      						A
	A	B    				B	A
	A	B	C  			C	B	A
	A	B	C	D	D	C	B	A
	A	B	C  			C	B	A
	A	B   				B	A
	A							A            */
	
public class pattern81{
	public static void main(String[] args){
		for(int i=1;i<=7;i++){
			char ch='A';
			for(int j=1;j<=8;j++){
				if((i<=4 && (j<=i || j>=9-i)) || (i>4 && (j<=8-i || j>=i+1))){
					System.out.print(" "+ch+" ");
				}else{
					System.out.print("   ");
				}
				if (j < 4) {
                    ch++;
                } else if (j >= 5) {
                    ch--;
                }
			}
			System.out.println();
		}	
	}
}