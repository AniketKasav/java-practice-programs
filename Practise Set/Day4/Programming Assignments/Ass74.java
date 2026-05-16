/*74. Check Lower Triangular Matrix
Problem Statement

Given a square matrix of size n x n, check whether the matrix is a lower triangular matrix or not.

A matrix is called a lower triangular matrix if all elements above the main diagonal are 0.

Condition:

i < j  →  matrix[i][j] must be 0

Print:

"Lower Triangular Matrix" if true
otherwise print "Not Lower Triangular Matrix"
Hardcoded Input
int matrix[][] = {
    {1, 0, 0},
    {2, 4, 0},
    {3, 5, 6}
};
Output
Lower Triangular Matrix   */

import java.util.*;
public class Ass74{
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
		
		boolean flag=true;
		outer:
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				if(i<j && mat[i][j]!=0){
					flag=false;
					break outer; 
				}
			}
		}
		if(flag){
			System.out.println("Lower Triangular Matrix");
		}else{
			System.out.println("Not Lower Triangular Matrix");
		}
	}
}