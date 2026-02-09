/*Q49. Write a java program to print this pattern.

	1
	2	*	2
	3	*	3	*	3
	4	*	4	*	4	*	4
	3	*	3	*	3
	2	*	2
	1                                        */
	
	
import java.util.Scanner;
public class pattern49{
	public static void main(String[] args){
		/* int c=1;
		for (int i=1;i<=7;i++){
			for(int j=1;j<=4;j++){
				if(i<=4 && j<=i){
					System.out.print(c);
					if(j<i){
						System.out.print("*");
					}
				}else if(i>4 && j<=8-i){
					System.out.print(c);
					if(j<8-i){
						System.out.print("*");
					}
				}	
			}
			if(i<4)c++;
			else c--;
			System.out.println(); */
			
			
			// optimal solution
			int num;
			for(int i=1;i<=7;i++){
				num=(i<=4)?i:8-i;
				for(int j=1;j<=num;j++){
					System.out.print(num);
					if(j<num){
						System.out.print("*");
					}
				}
				System.out.println();
			}
		}	
	//}
}
