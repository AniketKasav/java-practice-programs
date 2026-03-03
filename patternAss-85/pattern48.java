/*Q48. Write a java program to print this pattern.

					1
				1		2
			1		2		3
		1		2		3		4
	1		2		3		4		5
		1		2		3		4
			1		2		3
				1		2
					1                             */
					
					
import java.util.Scanner;
public class pattern48{
	public static void main(String[] args){
		int c;
		for (int i=1;i<=9;i++){
			c=1;
			for(int j=1;j<=9;j++){
				if(i<=5 && j>=6-i && j<=4+i){
					if((i+j)%2==0){
						System.out.print(" "+c+" ");
						c++;
					}else{
						System.out.print("   ");
					}
					
				}else if (i>5 && j>=i-4 && j<=14-i){
					if((i+j)%2==0){
						System.out.print(" "+c+" ");
						c++;
					}else{
						System.out.print("   ");
					}
					
				}else{
					System.out.print("   ");
				}	
			}
			
			System.out.println();
		}	
	}
}