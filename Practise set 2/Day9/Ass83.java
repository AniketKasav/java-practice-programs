/*83. Find the longest common subsequence of two strings.

String 1: ABCDEF
String 2: FBDAMN

Output: BD
Length: 2   

Another Example
String 1: AGGTAB
String 2: GXTXAYB

Output: GTAB
Length: 4         */

import java.util.Scanner;
public class Ass83{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string1 ");
		String str1=sc.nextLine();
		System.out.println("Enter a string2 ");
		String str2=sc.nextLine();
		String[][] memo=new String[str1.length()][str2.length()];
		String ans=solve(str1,str2,0,0,memo)	;
		System.out.println("Output :"+ans);
	}
	
	public static String solve(String str1,String str2,int i,int j,String[][] memo){
		if(i==str1.length() || j==str2.length() || i<0 || j<0){
			return "";
		}
		if(memo[i][j]!=null){
			return memo[i][j];
		}
		if(str1.charAt(i)==str2.charAt(j)){
			memo[i][j]=str1.charAt(i)+solve(str1,str2,i+1,j+1,memo);
			return memo[i][j];
		}
		String s1=solve(str1,str2,i+1,j,memo);
		String s2=solve(str1,str2,i,j+1,memo);
		memo[i][j]=(s1.length()>s2.length())?s1:s2;
		return memo[i][j];
	}
}