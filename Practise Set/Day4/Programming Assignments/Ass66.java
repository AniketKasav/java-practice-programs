/*66 Print boundary elements —
Problem Statement
Given a 2D matrix of size m x n, print all the boundary elements in clockwise order.
Boundary elements include:
first row
last column
last row
first column
Do not print any element more than once.
Hardcoded Input
int matrix[][] = {
    {1, 2, 3, 4},
    {5, 6, 7, 8},
    {9,10,11,12}
};
Output
1 2 3 4 8 12 11 10 9 5     */

import java.util.*;
public class Ass66{
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
		System.out.println("Print boundary elements: ");
		// here we use the spiral matrix approach
		int left=0;
		int top=0;
		int right=col-1;
		int bottom=row-1;
		int k=0;
			//left--->right
			for(int i=left;i<=right;i++){
				System.out.print(matrix[top][i]+" ");
			}
			top++;
			//top--->bottom
			for(int i=top;i<=bottom;i++){
				System.out.print(matrix[i][right]+" ");
			}
			right--;
			// right --> left
			if(top<=bottom){
				for(int i=right;i>=left;i--){
					System.out.print(matrix[bottom][i]+" ");
				}
				bottom--;
			}
			
			//bottom--->top
			if(left<=right){
				for(int i=bottom;i>=top;i--){
					System.out.print(matrix[i][left]+" ");
				}
				left++;
			}		
		
	}
}