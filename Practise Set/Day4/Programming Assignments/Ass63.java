//63 Multiply two matrices LC 311
//this is the paid problem on leetcode 
// here is the program 

import java.util.*;
public class Ass63{
	public static void main(String[] args){
		//Scanner sc=new Scanner(System.in);
		int mat1[][] = {{1, 2, 3},
						{4, 5, 6}};
		int mat2[][] = {{1,2,3,4},
						{5,6,7,8},
						{9,1,2,3}};
						
		System.out.println("Matrix 1 :");
		for(int i=0;i<mat1.length;i++){
			for(int j=0;j<mat1[0].length;j++){
				System.out.print(mat1[i][j]+"  ");
			}
			System.out.println();
		}
		
		System.out.println("Matrix 2 :");
		for(int i=0;i<mat2.length;i++){
			for(int j=0;j<mat2[0].length;j++){
				System.out.print(mat2[i][j]+"  ");
			}
			System.out.println();
		}
		// for the multiplication we required 3 loops
		// and rule is column of 1st matrix== rows of the 2nd matrix
		// (2*3)*(3*4)  // 3==3
		System.out.println("Multiplication two matrices : ");
		for(int i=0;i<mat1.length;i++){
			for(int j=0;j<mat2[0].length;j++){
				int sum=0;
				for(int k=0;k<mat1[0].length;k++){
					sum+=mat1[i][k]*mat2[k][j];
				}
				System.out.print(sum+"  ");
			}
			System.out.println();
		}
		
		
	}
}