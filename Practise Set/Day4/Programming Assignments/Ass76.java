/*76. Print Matrix in Wave Form
Problem Statement

Given a matrix of size n × m, print its elements in wave form.

In wave form traversal:

Print the first column from top to bottom
Print the second column from bottom to top
Print the third column from top to bottom
Continue this pattern alternately for all columns.
Sample Input
Matrix =
1  2  3
4  5  6
7  8  9
Wave Form Traversal
Column 0 → Top to Bottom → 1 4 7
Column 1 → Bottom to Top → 8 5 2
Column 2 → Top to Bottom → 3 6 9
Output
1 4 7 8 5 2 3 6 9        */

import java.util.*;
public class Ass76{
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
		int i=0;
		int j=0;
		int k=0;
		int dir=1;
		int ans[]=new int[row*col];
		while(j<col&&k<row*col){
			if(dir==1){
				ans[k]=mat[i][j];
				i++;
				k++;
				if(i==row){
					i--;
					j++;
					if(j==col)
					break;
					dir=0;
				}
			}
			if(dir==0){
				ans[k]=mat[i][j];
				i--;
				k++;
				if(i==-1){
					i=0;
					j++;
					dir=1;
				}
			}
		}
		System.out.println("Output :");
		for(int l=0;l<ans.length;l++){
			System.out.print(ans[l]+" ");
		}
		
	}
}