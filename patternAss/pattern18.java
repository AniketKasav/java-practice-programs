/*Q18. Write a java program to print this pattern.
										i	j 
					*					1	5
				*		*				2	4,6
			*				*			3	3,7	
		*						*		4	2,8
	*	*	*	*	*	*	*	*	*   5   1-9    */
	
	
import java.util.Scanner;
public class pattern18{
	public static void main(String[] args){
		for(int i=1;i<=5;i++){
			for(int j=1;j<=9;j++){
				if(i==5 || j==6-i || j==4+i){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}