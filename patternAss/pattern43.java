/*Q43. Write a java program to print this pattern.

	1	2	3	4	5
	6	7	8	1	2
	3	4	5	6	7
	8	1	2	3	4	
	5	6	7	8	1                   */
	
	
import java.util.Scanner;
public class pattern43{
	public static void main(String[] args){
		int c=1;
		for (int i=1;i<=5;i++){
			for(int j=1;j<=5;j++){
				System.out.print(" "+c+" ");
				c++;
				if(c==9)c=1;
			}
			System.out.println();
		}	
	}
}