/*72 Check symmetric matrix
Problem Statement
Given a square matrix of size n x n, check whether the matrix is symmetric or not.
A matrix is called symmetric if:
A=A^T

which means:

matrix[i][j] == matrix[j][i]
for every valid index.
Print:
"Symmetric Matrix" if the matrix is symmetric
otherwise print "Not Symmetric Matrix"
Hardcoded Input
int matrix[][] = {
    {1, 2, 3},
    {2, 4, 5},
    {3, 5, 6}
};
Output
Symmetric Matrix     */

import java.util.*;

public class Ass72 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int row = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int col = sc.nextInt();

        if(row != col){
            System.out.println("Symmetric matrix is only possible for square matrices.");
            return;
        }
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
        boolean flag = true;
        outer:
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                if(mat[i][j] != mat[j][i]){
                    flag = false;
                    break outer;
                }
            }
        }

        if(flag){
            System.out.println("Symmetric Matrix");
        }else{
            System.out.println("Not Symmetric Matrix");
        }

    }
}