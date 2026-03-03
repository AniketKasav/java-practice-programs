/*Q74. Write a java program to print this pattern.
		
	A	B	C	D	E
		1	2	3	4
			A	B	C
				1	2
					A            */
					
					
					
					
public class pattern74{
	public static void main(String[] args){
		int n;
		for(int i=1;i<=5;i++){
			n=1;
			for(int j=1;j<=5;j++){
				if(j<i){
					System.out.print("  ");
				}else{
					if(i%2==0){
						System.out.print(n+" ");
						n++;
					}else{
						System.out.print((char)(n+64)+" ");
						n++;
					}
				}
			}
			System.out.println();
		}
	}
}