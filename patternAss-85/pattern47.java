/*Q47. Write a java program to print this pattern.

					1
				2		2
			3				3
		4						4
	5								5
		4						4
			3				3
				2		2
					1                            */
					
import java.util.Scanner;
public class pattern47{
	public static void main(String[] args){
		int c=1;
		for (int i=1;i<=9;i++){
			for(int j=1;j<=9;j++){
				if(i<=5 && j== 6-i || j==4+i){
					System.out.print(c);
				}else if(i>5 && j==i-4 || j== 14-i){
					System.out.print(c);	
				}
				else{
					System.out.print(" ");
				}	
			}
			System.out.println();
			if(i<5)c++;
			else c--;
		}	
	}
}