/*Q40. Write a java program to print this pattern.

	5	*	5	*	5
	4	*	4	*
	3	*	3
	2	*
	1                               */
	
	
import java.util.Scanner;
public class pattern40{
	public static void main(String[] args){
		int c=5;
		for (int i=1;i<=5;i++){
			for(int j=1;j<=5;j++){
				if(j<=6-i){
					if(j%2==1){
						System.out.print(" "+c+" ");
					}else{
						System.out.print(" * ");
					}
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
			c--;
		}	
	}
}