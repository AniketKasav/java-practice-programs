/*Q44. Write a java program to print this pattern.

	1	2	3	4	5
	2	2	3	4	5
	3	3	3	4	5
	4	4	4	4	5
	5	5	5	5	5                     */
	
	
import java.util.Scanner;
public class pattern44{
	public static void main(String[] args){
		int c;
		for (int i=1;i<=5;i++){
			c=i;
			for(int j=1;j<=5;j++){
				System.out.print(" "+c+" ");
				if(j>=i)c++;
			}
			System.out.println();
		}	
	}
}