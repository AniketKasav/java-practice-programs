/*73. Check Upper Triangular Matrix
Problem Statement

Given a square matrix of size n x n, check whether the matrix is an upper triangular matrix or not.

A matrix is called an upper triangular matrix if all elements below the main diagonal are 0.

Condition:

i > j  →  matrix[i][j] must be 0

Print:

"Upper Triangular Matrix" if true
otherwise print "Not Upper Triangular Matrix"
Hardcoded Input
int matrix[][] = {
    {1, 2, 3},
    {0, 4, 5},
    {0, 0, 6}
};
Output
Upper Triangular Matrix   */

import java.util.*;
public class Ass73{
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
				if(i>j && mat[i][j]!=0){
					flag=false;
					break outer; 
				}
			}
		}
		if(flag){
			System.out.println("Upper Triangular Matrix");
		}else{
			System.out.println("Not Upper Triangular Matrix");
		}
	}
}