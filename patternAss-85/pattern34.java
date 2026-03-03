/*Q34. Write a java program to print this pattern.

	1	2	3	4	5
	2	3	4	5	6
	3	4	5	6	7
	4	5	6	7	8
	5	6	7	8	9                  */
	
import java.util.Scanner;
public class pattern34{
	public static void main(String[] args){
		for (int i=1;i<=5;i++){
			int c=i;
			for(int j=1;j<=5;j++){
				System.out.print(" "+c+" ");
				c++;
			}
			System.out.println();
		}	
	}
}