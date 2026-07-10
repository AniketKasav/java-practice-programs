/*52. Check whether one string is a rotation of another.

Example 1
Input:
A = "abcd"
B = "cdab"

Rotation process:
abcd
↓
bcda
↓
cdab
Output:
True

Example 2
Input:
A = "waterbottle"
B = "erbottlewat"
Output:
True
Because erbottlewat is a rotation of waterbottle. */


import java.util.Scanner;
public class Ass52{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String  ");
		String str=sc.nextLine();
		System.out.println("Enter the another string ");
		String goal=sc.nextLine();
		
		if(str.length()<goal.length()){
			System.out.println("false");
		}
		//boolean ans = (str+str).contains(goal);
		//System.out.println(ans);
		
		boolean flag=false;
		for(int i=0;i<str.length();i++){
			String sub=str.substring(i)+str.substring(0,i);
			if(sub.equals(goal)){
				flag=true;
				break;
			}
		}
		if(flag){
			System.out.println("True");
		}else{
			System.out.println("False");
		}
		
	}
}