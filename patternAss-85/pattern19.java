/*Q18. Write a java program to print this pattern.

	*	*	*	*	*	*	
      *   *	  *   *   *        
		*	*	*	*
		  *   *   *
			*   *
			  *                                 */
			  
			  
import java.util.Scanner;
public class pattern19{
	public static void main(String[] args){
		for(int i=1;i<=6;i++){
			for(int j=1;j<=6;j++){
				if(j>=i ){
					System.out.print("* ");
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}