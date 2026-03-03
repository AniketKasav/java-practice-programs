/*Q20. Write a java program to print this pattern.

	*						*
	*	*				*	*
	*		*		*		*
	*			*			*
	*		*		*		*
	*	*				*	*
	*						*                   */
	
import java.util.Scanner;
public class pattern20{
	public static void main(String[] args){
		for(int i=1;i<=7;i++){
			for(int j=1;j<=7;j++){
				if(j==1 || j==7 || i==j || j==8-i ){
					System.out.print("*\t");
				}else{
					System.out.print("\t");
				}
			}
			System.out.println();
		}
	}
}