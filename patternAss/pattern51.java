/*Q51. Write a java program to print this pattern.
						i	num  j>=5-num
				1		1	1	5-1=4
			2	2		2	2	3
		3	3	3		3	3	2
	4	4	4	4		4	4	1
        3	3	3		5	3	5-3=2
            2	2		6	2	3
                1       7   1   4    */
				
				
				
import java.util.Scanner;
public class pattern51{
	public static void main(String[] args){
		for (int i=1;i<=7;i++){
			int num=(i<=4)?i:8-i;
			for(int j=1;j<=4;j++){
				if(j>=5-num){
					System.out.print(" "+num+" ");
				}else{
					System.out.print("   ");
				}
			}
			System.out.println();
		}	
	}
}