/*67. Find the longest common prefix among multiple strings.

Strings: "flower", "flow", "flight"
Longest common prefix: "fl"
Strings: "programming", "programmer", "program"
Longest common prefix: "program"                          */

import java.util.*;
public class Ass67{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 3 string :");
		String str[]=new String[3];
		for(int i=0;i<str.length;i++){
			str[i]=sc.next();
		}
		Arrays.sort(str);
		StringBuilder sb=new StringBuilder();
		int n=str.length;
		for(int i=0;i<str[0].length();i++){
			if(str[0].charAt(i)==str[n-1].charAt(i)){
				sb.append(str[0].charAt(i));
			}else{
				break;
			}
		}
		
		System.out.println("Longest common prefix:"+sb);
	}
}