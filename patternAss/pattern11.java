/*Q11. Write a java program to print this pattern.
					i	j
*					1	1
*	*				2	1,3
* 		*			3	1,5
*  			*		4	1,7
*	*	*	*	*   5   1-9                  */

import java.util.Scanner;
public class pattern11{
	public static void main(String[] args){
		for(int i=1;i<=5;i++){
			for(int j=1;j<=9;j++){
				if(j==1 || j==2*i-1 || i==5)
				{
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}