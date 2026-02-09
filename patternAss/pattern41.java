/*Q41. Write a java program to print this pattern.

					1	
				2	3	2
			3	4	5	4	3
        4	5	6	7	6	5	4
	5	6	7	8	9	8	7	6	5                        */
	
	
import java.util.Scanner;
public class pattern41{
	public static void main(String[] args){
		int c;
		for (int i=1;i<=5;i++){
			c=i;
			for(int j=1;j<=9;j++){
				if(j>=6-i && j<=4+i){
					System.out.print(" "+c+" ");
					if(j<5){
						c++;
					}else{
						c--;
					}
				}else{
					System.out.print("   ");
				}
			}
			System.out.println();
		}	
	}
}