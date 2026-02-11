/*Q60. Write a java program to print this pattern.

1        							1
1	2							2	1
1	2	3					3	2	1
1	2	3	4			4	3	2	1
1	2	3	4	5	5	4	3	2	1          */



import java.util.Scanner;
public class pattern60{
	public static void main(String[] args){
		for (int i=1;i<=5;i++){
			int c=1;
			for(int j=1;j<=10;j++){
				if(j>i && j<=10-i){
					System.out.print(" ");
				}else{
					System.out.print(c);
					if (j < i)
                        c++;
                    else if (j >= 10 - i + 1)
                        c--;
				}
			}
			System.out.println();
		}	
	}
}