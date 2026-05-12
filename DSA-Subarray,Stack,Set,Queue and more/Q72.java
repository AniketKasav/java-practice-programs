/*Question 72: Print All Subarrays
Description:
Print all possible subarrays of array size n.
Input:
[1,2,3]

Output:
[1] [1,2] [1,2,3] [2] [2,3] [3]    */

class Q72{
	public static void main(String[] args){
		int arr[]=new int[]{1,2,3};
		int n=arr.length;
		for(int i=0;i<n;i++){
			for(int j=i;j<n;j++){
				System.out.print("[");
				for(int k=i;k<=j;k++){
					System.out.print(arr[k]);
				}
				System.out.print("]");
				System.out.print(" ");
			}
		}
	}
}