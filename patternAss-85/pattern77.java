/*Q77. Write a java program to print this pattern.

					A
				#	#	#
			A	B	C	B	A
		#	#	#	#	#	#	#
	A	B	C	D	E	D	C	B	A
		#	#	#	#	#	#	#
			A	B	C	B	A
				#	#	#
					A                            */
					
					
					
public class pattern77{
	public static void main(String[] args){
		int n;
		for(int i=1;i<=9;i++){
			n=1;
			for(int j=1;j<=9;j++){
				if((i<=5 && j>=6-i && j<=4+i)||(i>5 && j>=i-4 && j<=14-i)){
					if(i%2==1){
						System.out.print(" "+(char)(n+64)+" ");
						n=j<5?++n:--n;
					}else{
						System.out.print(" # ");
					}
				}else{
					System.out.print("   ");
				}
			}
			System.out.println();
		}	
	}
}