/*79. Interchange Columns of Matrix
Problem Statement

Given a matrix of size n × m, interchange (swap) two columns of the matrix and print the updated matrix.

The user should enter:

matrix elements
two column numbers to swap
Sample Input
Matrix =
1 2 3
4 5 6
7 8 9

Swap column 0 and column 2
Output
3 2 1
6 5 4
9 8 7   */

import java.util.*;
public class Ass79{
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
		System.out.println("Enter two column number we want to interchange : ");
		int col1=sc.nextInt();
		int col2=sc.nextInt();
		for(int i=0;i<row;i++){
				int temp=mat[i][col1];
				mat[i][col1]=mat[i][col2];
				mat[i][col2]=temp;
		}	
		
		System.out.println("Output : ");
		for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                System.out.print(mat[i][j] + "  ");
            }
            System.out.println();
        }
	}
}