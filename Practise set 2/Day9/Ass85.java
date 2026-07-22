/*85. Find the edit distance between two strings.

Edit distance means the minimum number of insertions, deletions, or replacements needed to change one string into another.

Simple example
String 1: cat
String 2: cut
Change:
cat → cut
Replace a with u.
So, edit distance = 1.

Another example:
horse → ros
One possible minimum sequence:
horse → rorse (replace h with r)
rorse → rose (delete r)
rose → ros (delete e)

So edit distance = 3.    */


import java.util.Scanner;
public class Ass85{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string1 ");
		String str1=sc.nextLine();
		System.out.println("Enter a string2 ");
		String str2=sc.nextLine();
		int n=str1.length();
		int m=str2.length();
		int[][] dp=new int[n+1][m+1];
		for(int i=0;i<=n;i++){
			dp[i][0]=i;
		}
		for(int i=0;i<=m;i++){
			dp[0][i]=i;
		}
		
		for(int i=1;i<=str1.length();i++){
			for(int j=1;j<=str2.length();j++){
				if(str1.charAt(i-1)==str2.charAt(j-1)){
					dp[i][j]=dp[i-1][j-1];
				}else{
					int ans=Math.min(dp[i-1][j-1],Math.min(dp[i][j-1],dp[i-1][j]));
					dp[i][j]=ans+1;
				}
				
			}
		}
		
		System.out.println("edit distance ="+dp[n][m]);
		
	}
	
	
}
