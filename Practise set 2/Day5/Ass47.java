/*47. Sort characters in a string alphabetically.

Example 1
Input:
programming

Characters:
p r o g r a m m i n g

Sorted Characters:
a g g i m m n o p r r

Output:
aggimmnoprr    */

import java.util.*;
public class Ass47{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the string ");
		String str=sc.nextLine();
		int idx=0;
		char arr[]=str.toCharArray();
		for(int i=0;i<arr.length;i++){
			idx=i;
			for(int j=i+1;j<arr.length;j++){
				if(arr[j]<arr[idx]){
					idx=j;
				}
			}
			char temp=arr[i];
			arr[i]=arr[idx];
			arr[idx]=temp;
		}
		
		System.out.println("Output: "+new String(arr));
	}
}