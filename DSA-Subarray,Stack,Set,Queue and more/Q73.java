/*Question 73: Sum of All Subarrays
Description:

Given an array of size n, calculate the sum of all possible subarrays.

A subarray is a contiguous part of an array.
Input:
n = 3
Array = [1, 2, 3]

Output:
Subarrays:
[1] ? 1
[1,2] ? 3
[1,2,3] ? 6
[2] ? 2
[2,3] ? 5
[3] ? 3

Total Sum = 20
Explanation:
We use two loops:
First loop selects starting index.
Second loop selects ending index and keeps adding elements.

Number of subarrays = n(n+1)/2
For n=3 ? 6 subarrays.                     */

class Q73{
	public static void main(String[] args){
		int arr[]=new int[]{1,2,3};
		int n=3;
		for(int start=0;start<n;start++){
			for(int end=start;end<n;end++){
				int sum=0;
				System.out.print("[");
				for(int k=start;k<=end;k++){
					System.out.print(arr[k]+" ");
					sum+=arr[k];
				}
				System.out.print("] ? ");
				System.out.print(sum+"\n");
			}
		}
	}
}