/*Q83. Write a java program to print this pattern.


				1    
			A	    B   
		2				3  
    B			    		C	 	
4		5		6		7		8             */

public class pattern83{
	public static void main(String[] args){
		int n=1;
		char ch='A';
		for(int i=1;i<=5;i++){
			
			for(int j=1;j<=9;j++){
				
				if((i+j)%2==0 && (j==6-i || j==4+i || i==5)){
					if(i%2==1){
						System.out.print(" "+n+" ");
						n++;
					}
					else {
						System.out.print(" "+ch+" ");
						ch++;
						}
					}
				else{
					System.out.print("   ");
				}
			}	
			if(i%2==0){
				ch--;
			}
			System.out.println();
		}	
	}
}

