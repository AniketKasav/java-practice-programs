/*Question 74: Count Frequency of Each Element (Without Hashing)
Description:
Given an array, count how many times each element appears using nested loops (no HashMap allowed).
Input:
n = 5
Array = [1, 2, 2, 3, 1]

Output:
1 ? 2 times
2 ? 2 times
3 ? 1 time

Explanation:
For each element:
Loop through entire array again.
Count matches.

Outer loop runs n times.
Inner loop runs n times.

Time Complexity: O(n²)
Because every element is compared with every other element.          */

import java.util.*;
class Q74{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array size : ");
		int n=sc.nextInt();
		System.out.print("Enter the elements of the array : ");
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		HashMap<Integer,Integer>mp=new HashMap<>();
		
		for(int i=0;i<n;i++){
			mp.put(arr[i],mp.getOrDefault(arr[i],0)+1);
		}
		System.out.println("Keys :");
		for(Integer key:mp.keySet()){
			System.out.println(key);
		}
		
		System.out.println("values");
		for(Integer value:mp.values()){
			System.out.println(value);
		}
		System.out.println("Key --> Value");
		for(Map.Entry<Integer,Integer>entry : mp.entrySet()){
			System.out.println(entry.getKey()+" --> "+entry.getValue());
		}
	}
}

