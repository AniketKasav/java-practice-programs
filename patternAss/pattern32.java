/*Q32. Write a java program to print this pattern.

					*
				#	#
			*	*	*
		#	#	#	#
	*	*	*	*	*                 */
	
import java.util.Scanner;
public class pattern32{
	public static void main(String[] args){
		
		for (int i=1;i<=5;i++){
			for(int j=1;j<=5;j++){
				if(j>=6-i){
					if(i%2==1){
						System.out.print(" * ");
					}else{
						System.out.print(" # ");
					}
				}else{
					System.out.print("   ");
				}
			}
			System.out.println();
		}	
	}
}