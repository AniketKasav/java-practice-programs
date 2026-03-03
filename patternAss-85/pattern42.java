/*Q41. Write a java program to print this pattern.

	1
	3	3	3
	5	5	5	5	5	
	3	3	3
	1                                      */
	
public class pattern42 {
    public static void main(String[] args) {

        int num = 1;

        // upper half (including middle)
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= num; j++) {
                System.out.print(num + " ");
            }
            System.out.println();
            num += 2;
        }

        // lower half
        num -= 4;
        for (int i = 1; i <= 2; i++) {
            for (int j = 1; j <= num; j++) {
                System.out.print(num + " ");
            }
            System.out.println();
            num -= 2;
        }
    }
}
