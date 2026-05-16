/*80 Count even and odd numbers in matrix
Problem Statement
Given a 2D matrix of size m x n, count how many even and odd numbers are present in the matrix.
Print:
total even numbers
total odd numbers
Hardcoded Input
int matrix[][] = {
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
};
Output
Even Count = 4
Odd Count = 5

Explanation:

Even numbers → 2 4 6 8
Odd numbers  → 1 3 5 7 9   */

import java.util.*;
public class Ass80{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int row = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int col = sc.nextInt();
        int mat[][] = new int[row][col];
        System.out.println("Enter matrix elements:");
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                mat[i][j] = sc.nextInt();
            }
        }
        System.out.println("Matrix :");
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                System.out.print(mat[i][j] + "  ");
            }
            System.out.println();
        }
		
		int oddCount=0;
		int evenCount=0;
		for(int i=0;i<col;i++){
			for(int j=0;j<row;j++){
				if(mat[i][j]%2==0){
					evenCount++;
				}else{
					oddCount++;
				}
			}
		}
		System.out.printf("Even Count = %d\n",evenCount);
		System.out.printf("Odd Count = %d\n",oddCount);
	}
}