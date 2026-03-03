/*Q13. Write a java program to print this pattern.
						i	j/*		#
*	*	*	*	*		1	1-5		0
*	*	*	*	#		2	1-4		5
*	*	*	#	#		3	1-3		3-5
*	*	#	#	#		4	1-2		3-5
*	#	#	#	#       5   1       2-5          */

import java.util.Scanner;
public class pattern13{
	public static void main(String[] args){
		for(int i=1;i<=5;i++){
			for(int j=1;j<=5;j++){
				if(j<=6-i){
					System.out.print("*");
				}else{
					System.out.print("#");
				}
			}
			System.out.println();
		}
	}
}