/*Q14. Write a java program to print this pattern.
						i		j
			 *******   	1		1-7   
			 ******		2		1-6
 			 *****		3		1-5
 			 ****		4		1-4
 			 ***		5		1-3
 			 **			6		1-2
 			 *			7		1
 			 **			8		1-2
 			 ***		9		1-3
 			 ****		10		1-4
 			 *****		11		1-5
 			 ******		12		1-6
 			 *******    13      1-7     	         */
			 
			 
import java.util.Scanner;
public class pattern14{
	public static void main(String[] args){
		for(int i=1;i<=13;i++){
			for(int j=1;j<=7;j++){
				if(j<=8-i || j<=i-6){
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}