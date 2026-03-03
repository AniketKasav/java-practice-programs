/*Q58. Write a java program to print this pattern.

	    		1
   		      1   1
    		1   	1
 	     1     		  1
       1 	2	3   4	1               */
	   
	   
	   
import java.util.Scanner;
public class pattern58{
	public static void main(String[] args){
		for (int i = 1; i <= 5; i++) {
            int c = 1;

            for (int j = 1; j <= 9; j++) {

                if (i <= 5 && (j == 6 - i || j == 4 + i)) {
                    System.out.print("1");
                }
                else if (i == 5 && j >= 2 && j <= 8 && (j+i) % 2 == 0) {
					c++;
                    System.out.print(c);
                    
                }
                else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
	}
}