/*Q46. Write a java program to print this pattern.

	1
	2	3
	4		5
	6			7
	8	9	10	11	12                 */
	

import java.util.Scanner;
public class pattern46{
	public static void main(String[] args){
		int c=1;
		for (int i=1;i<=5;i++){
			for(int j=1;j<=5;j++){
				if(i==5 || j==1 || j==i){
					System.out.print(" "+c+" ");
					c++;
				}else{
					System.out.print("   ");
				}	
			}
			System.out.println();
		}	
	}
}