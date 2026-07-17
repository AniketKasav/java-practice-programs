/*48. Sort words in a sentence alphabetically.

Example 1
Input:
banana apple mango orange

Words:
banana
apple
mango
orange

Sorted Words:
apple
banana
mango
orange

Output:
apple banana mango orange   */

import java.util.*;
public class Ass48{
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