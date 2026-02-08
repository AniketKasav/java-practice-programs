/*Q36. Write a java program to print this pattern.

	5	4	3	2	1
		4	3	2	1
			3	2	1	
				2	1	
					1           */
					
					
import java.util.Scanner;
public class pattern36{
	public static void main(String[] args){
		int c;
		for (int i=1;i<=5;i++){
			c=6-i;
			for(int j=1;j<=5;j++){
				if(j>=i){
					System.out.print(" "+c+" ");
					c--;
				}else{
					System.out.print("   ");
				}
				
			}
			System.out.println();
		}	
	}
}