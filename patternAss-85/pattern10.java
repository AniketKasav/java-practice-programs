/*Q10. Write a java program to print this pattern.
								i	j
*  *  *  *  *  *  *  *  *   	1	1-9
   *  *  *  *  *  *  *			2	2-8
	  *  *  *  *  *				3	3-7
		 *  *  *				4	4-6
			*                   5	5            */
			 
import java.util.Scanner;
public class pattern10{
	public static void main(String[] args){
		for(int i=1;i<=5;i++){
			for(int j=1;j<=9;j++){
				if(j>=i && j<=10-i){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}