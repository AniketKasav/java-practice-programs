/*Q20.Problem Statement
 Write a Java program to store strings in an ArrayList.
 Sort all strings in alphabetical order.
Input:
 ["Banana", "Apple", "Mango"]
Output:
 ["Apple", "Banana", "Mango"]   */
 
import java.util.*;

public class Ass20{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number of strings ");
		int n=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the strings");
		ArrayList<String>ls=new ArrayList<>();
		for(int i=0;i<n;i++){
			ls.add(sc.nextLine());
		}
		System.out.println("Output");
		for(int i=0;i<n;i++){
			for(int j=0;j<n-1-i;j++){
				if(solve(ls.get(j),ls.get(j+1))==1){
					String temp=ls.get(j);
					ls.set(j,ls.get(j+1));
					ls.set(j+1,temp);
				}
			}
		}
		
		System.out.println(ls);
	}
	
	public static int solve(String a,String b){
		
		int n=Math.min(a.length(),b.length());
		for(int i=0;i<n;i++){
			if(a.charAt(i)>b.charAt(i)){
				return 1;
			}
			if(a.charAt(i)<b.charAt(i)){
				return -1;
			}
		}
		
		if(a.length()>b.length()){
			return 1;
		}
		if(a.length()<b.length()){
			return -1;
		}
		return 0;
	}
}