/*Q5. Write a java program to print this pattern.

	*****
	****
	***
	**
	*                */
	
import java.util.Scanner;
public class pattern5{
	public static void main(String[] args){
		for(int i=1;i<=5;i++){
			for(int j=1;j<=5;j++){
				if(j<=6-i){
				System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}