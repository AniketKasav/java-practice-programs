/*Q56. Write a java program to print this pattern.

					1
               1	2	1	
           1   2	3	2	1
       1   2   3	4	3	2	1
 		   1   2	3	2	1	
               1	2	1	
                    1                         */
					
					
import java.util.Scanner;
public class pattern56{
	public static void main(String[] args){
		int c;
		for (int i=1;i<=7;i++){
			c=0;
			for(int j=1;j<=7;j++){
				if((i<=4 && j>=5-i && j<=3+i)||(i>4 && j>=i-3 && j<=11-i)){
					c=(j<=4)?++c:--c;
					System.out.print(" "+c+" ");
				}else{
					System.out.print("   ");
				}	
			}
			System.out.println();
		}	
	}
}