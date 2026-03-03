/*Q25. Write a java program to print this pattern.

				*
			*	*	*
		*		*		*
	*			*			*
*	*	*	*	*	*	*	*	*
	*			*			*
		*		*		*
			*	*	*
				*                               */
				
				
import java.util.Scanner;
public class pattern25{
	public static void main(String[] args){
		
		for (int i=1;i<=9;i++){
			for(int j=1;j<=9;j++){
				if( j==5 || i==5 ||j==6-i || j==4+i){
					System.out.print("* ");
				}else if( j==i-4 || j==14-i){
					System.out.print("* ");
				}else{
					System.out.print("  ");
				}
			}
			System.out.println();
		}	
	}
}