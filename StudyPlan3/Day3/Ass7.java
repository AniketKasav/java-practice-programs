/*Stack (3 Questions)
7. Valid Parentheses
Difficulty: Easy
Problem Statement
Given a string containing only (, ), {, }, [ and ], determine whether the parentheses are balanced.
Example
Input:
"{[()]}"

Output:
True              */

import java.util.*;

public class Ass7{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Input :");
		String str=sc.nextLine();
		Stack<Character>st=new Stack<>();
		boolean flag=true;
		for(char ch:str.toCharArray()){  //{{}}(()
			if(ch=='(' || ch=='[' || ch=='{')st.push(ch);
			if(st.isEmpty() || (ch==')' && st.pop()!='(')){
				flag=false;
				break;
			}
			if(st.isEmpty() || (ch==']' && st.pop()!='[')){
				flag=false;
				break;
			}
			if(st.isEmpty() ||(ch=='}' && st.pop()!='{')){
				flag=false;
				break;
			}
		}
		
		if (!st.isEmpty()) {
            flag = false;
        }
		System.out.println("Output :\n"+flag);
	}
}