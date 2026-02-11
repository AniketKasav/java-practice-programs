/*Q84. Write a java program to print this pattern.


	1		A		2		B		3  
		C	  	4      	D       5  
			6		E		7  
		F     	8      	G       9  
	H		10		I		11		J          */
	
	
/* may be there is some mistake in problem pattern output of this code is here :
	1		A		2		B		3  
		C	  	4      	D       5  
			E		6		F  
		7     	G      	8       H  
	9		I		10		J		11 
*/
	
	
public class pattern84{
	public static void main(String[] args){
		char ch='A';
		int n=1;
		boolean flag=true;
		for(int i=1;i<=5;i++){	
			for(int j=1;j<=9;j++){
				if((i<=3 && (j>=i && j<=10-i)) || (i>3 && (j>=6-i && j<=4+i))) {
					if((i+j)%2==0){
						if(flag){
							System.out.print(" "+n+" ");
							n++;
							flag=false;
						}else{
							System.out.print(" "+ch+" ");
							ch++;
							flag=true;
						}
					}
					else{
						System.out.print("   ");
					}
				}else{
					System.out.print("   ");
				}
			}
			System.out.println();
		}	
	}
}