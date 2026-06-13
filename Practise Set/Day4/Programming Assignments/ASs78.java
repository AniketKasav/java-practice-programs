/*78. Interchange Rows of Matrix
Problem Statement

Given a matrix of size n × m, interchange (swap) two rows of the matrix and print the updated matrix.

The user should enter:

matrix elements
two row numbers to swap
Sample Input
Matrix =
1 2 3
4 5 6
7 8 9

Swap row 0 and row 2
Output
7 8 9
4 5 6
1 2 3                  */

import java.util.*;
public class Ass78{
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
		System.out.println("Enter two rows number we want to interchange : ");
		int row1=sc.nextInt();
		int row2=sc.nextInt();
		for(int i=0;i<col;i++){
				int temp=mat[row1][i];
				mat[row1][i]=mat[row2][i];
				mat[row2][i]=temp;
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