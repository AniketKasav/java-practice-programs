/*68 Find column sum —
Problem Statement
Given a 2D matrix of size m x n, find and print the sum of each column.
Hardcoded Input
int matrix[][] = {
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
};
Output
Column 1 Sum = 12
Column 2 Sum = 15
Column 3 Sum = 18

Explanation:
Column 1 → 1 + 4 + 7 = 12
Column 2 → 2 + 5 + 8 = 15
Column 3 → 3 + 6 + 9 = 18          */

import java.util.*;
public class Ass68{
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
		
		
		System.out.println("print the sum of each column : ");
		for(int i=0;i<col;i++){
			int sum=0;
			for(int j=0;j<row;j++){
				sum+=mat[j][i];
			}
			System.out.printf("Column %d Sum = %d\n",i,sum);
		}
		
		
	}
}