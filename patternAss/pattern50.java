/*Q50. Write a java program to print this pattern.

	1	1	1	1	1	1	1
		2	2	2	2	2	
			3	3	3	
				4
			5	5	5
		6	6	6	6	6
	7	7	7	7	7	7	7                  */
	
	
	
import java.util.Scanner;
public class pattern50{
	public static void main(String[] args){
		/*int c=1;
		for (int i=1;i<=7;i++){
			for(int j=1;j<=7;j++){
				if(i<=4 && j>=i && j<=8-i){
					System.out.print(" "+i+" ");
				}else if(i>4 && j>=8-i && j<=i){
					System.out.print(" "+i+" ");
				}
				else{
					System.out.print("   ");
				}
			}
			System.out.println();  */
			for (int i = 1; i <= 7; i++) {

            int start = (i <= 4) ? i : 8 - i;
            int end = 8 - start;

            for (int j = 1; j <= 7; j++) {
                if (j >= start && j <= end) {
                    System.out.print(" " + i + " ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
			}
		//}	
	}
}