/*84. Find the longest common substring of two strings.

This is different from Longest Common Subsequence because now the characters must be continuous (contiguous).
Simple example:

String 1: ABCDEF
String 2: ZBCDF

Output: BCD
Length: 3               */

import java.util.Scanner;
public class Ass84{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string1 ");
		String str1=sc.nextLine();
		System.out.println("Enter a string2 ");
		String str2=sc.nextLine();
		int[][] dp=new int[str1.length()+1][str2.length()+1];
		int maxlen=0;
		int endidx=0;
		
		for(int i=1;i<str1.length();i++){
			for(int j=1;j<str2.length();j++){
				if(str1.charAt(i-1)==str2.charAt(j-1)){
					dp[i][j]=dp[i-1][j-1]+1;
					if(dp[i][j]>maxlen){
						maxlen=dp[i][j];
						endidx=j;
					}
					
				}else{
					dp[i][j]=0;
				}
			}
		}
		
		String ans=str2.substring(endidx-maxlen,endidx);
		
		System.out.println("Output: "+ans);
		System.out.println("Length :"+maxlen);
	}
	
	
}