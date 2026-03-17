/*Q55. Given an array nums of n integers, return an array of all the unique quadruplets [nums[a], nums[b], nums[c], nums[d]] such that:
	0 <= a, b, c, d < n
	a, b, c, and d are distinct.
	nums[a] + nums[b] + nums[c] + nums[d] == target
You may return the answer in any order.
Example 1:
Input: nums = [1,0,-1,0,-2,2], target = 0
Output: [[-2,-1,1,2],[-2,0,0,2],[-1,0,0,1]]
Example 2:
Input: nums = [2,2,2,2,2], target = 8
Output: [[2,2,2,2]]
Constraints:
	1 <= nums.length <= 200
	-109 <= nums[i] <= 109
	-109 <= target <= 109               */
	
	
import java.util.*;
public class Ass55{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the array size : ");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the array elements ");
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		System.out.print("Traget : ");
		int target=sc.nextInt();
		// 3sum  problem logic ....
		Arrays.sort(a);
		boolean flag=false;
		for(int i=0;i<n-3;i++){
			if(i>0 && a[i]==a[i-1])continue;
			for(int j=i+1;j<n-2;j++){
				if(j>i+1 && a[j]==a[j-1])continue;
				int k=j+1;
				int l=n-1;
				while(k<l){
					int sum=a[i]+a[j]+a[k]+a[l];
					if(sum==target){
						flag=true;
						System.out.printf("[%d, %d, %d, %d]\n",a[i],a[j],a[k],a[l]);
						k++;
						l--;
						while(k<l && a[k]==a[k-1])k++;
						while(k<l && a[l]==a[l+1])l--;
					}
					else if(sum<target){
						k++;
					}else{
						l--;
					}
				}
			}
		}
		if(!flag){
			System.out.print("[  ]");
		}
		
	}
}