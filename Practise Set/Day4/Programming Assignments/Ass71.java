/*71 Check identity matrix
Problem Statement
Given a square matrix of size n x n, check whether the matrix is an identity matrix or not.
A matrix is called an identity matrix if:
all diagonal elements are 1
all non-diagonal elements are 0
Print:
"Identity Matrix" if the matrix satisfies the conditions
otherwise print "Not Identity Matrix"
Hardcoded Input
int matrix[][] = {
    {1,0,0},
    {0,1,0},
    {0,0,1}
};
Output
Identity Matrix       */

import java.util.*;
public class Ass71{
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
		
		
		System.out.println("Check identity matrix : ");
		boolean flag=true;
		outer:
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				if(i==j && mat[i][j]!=1){
					flag=false;
					break outer;
				}else if(i!=j && mat[i][j]!=0){
					flag=false;
					break outer;
				}
			}
		}
		if(flag){
			System.out.print("Identity Matrix ");
		}else{
			System.out.print("NOT Identity Matrix ");
		}
		
	}
}