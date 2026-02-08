/*Q22. Write a java program to print this pattern.

	*	*	*	*	*
	  *	     	  *
		*       *
		  *   *
			*                             */
			
public class pattern22 {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 9; j++) {

                if (i == 1 && j % 2 != 0) {
                    System.out.print("*");
                }
                else if (i > 1 && (j == i || j == 10 - i)) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

