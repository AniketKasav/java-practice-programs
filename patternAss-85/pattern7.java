/*Q7. Write a java program to print this pattern.
			i	j
	*****  	1	5
	 ****	2	4
	  ***	3	3
	   **	4	2
        *   5	1          */
		
import java.util.Scanner;
public class pattern7{
	public static void main(String[] args){
		for(int i=1;i<=5;i++){
			for(int j=1;j<=5;j++){
				if(j<i){
					System.out.print(" ");
				}else{
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}