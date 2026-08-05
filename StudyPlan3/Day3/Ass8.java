/*8. Evaluate Postfix Expression
Difficulty: Medium
Problem Statement
Given a postfix expression consisting of digits and operators (+, -, *, /), evaluate the expression using a Stack.
Example
Input:
"23*54*+"

Output:
26           */

import java.util.*;

public class Ass8{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Input :");
		String str=sc.nextLine();
		Stack<Integer>st=new Stack<>();
		int n1=0;
		int n2=0;
		int ans=0;
		for(int i=0;i<str.length();i++){
			char ch=str.charAt(i);
			if(ch>='0' && ch<='9'){
				st.push(ch-'0');
			}
			if(ch=='+'){
				n1=st.pop();
				n2=st.pop();
				ans=(n2+n1);
				st.push(ans);
			}
			if(ch=='-'){
				n1=st.pop();
				n2=st.pop();
				ans=(n2-n1);
				st.push(ans);
			}
			if(ch=='*'){
				n1=st.pop();
				n2=st.pop();
				ans=(n2*n1);
				st.push(ans);
			}
			if(ch=='/'){
				n1=st.pop();
				n2=st.pop();
				ans=(n2/n1);
				st.push(ans);
			}
		
		}
		int result=0;
		while(!st.isEmpty()){
			result=result*10+st.pop();
		}
		System.out.println("Output :"+result);
	}
}