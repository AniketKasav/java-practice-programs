/*Q57. Write a java program to print this pattern.

			  	1
             1	  1
           1	2	1
         1	 3    3   1
       1   4	6	4	1                 */
	   
	   
	   
public class pattern57 {
    public static void main(String[] args) {

        int n = 5;

        for (int i = 0; i < n; i++) {

            // Print spaces
            for (int space = 0; space < n - i - 1; space++) {
                System.out.print("  ");
            }

            int value = 1;

            // Print Pascal values
            for (int j = 0; j <= i; j++) {
                System.out.print(value + "   ");
                value = value * (i - j) / (j + 1);
            }

            System.out.println();
        }
    }
}
