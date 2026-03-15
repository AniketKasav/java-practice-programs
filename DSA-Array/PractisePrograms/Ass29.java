/*Q29. Rearrange the array so that even and odd numbers alternate. Assume the number of even and odd elements is equal.
	Input :- arr = [1, 2, 3, 4, 5, 6]
	Output :-  [2, 1, 4, 3, 6, 5]
Explanation:
Even and odd elements are rearranged to appear alternately: Even → Odd → Even → Odd.
The relative order within even and odd groups may not be important, but alternation is maintained.     */

import java.util.Scanner;
public class Ass29{
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the array size (even size): ");
		int n=sc.nextInt();
		System.out.println("Enter array elements(even and odd elements is equal) : ");
		int []a=new int[n];
		for(int i=0;i<a.length;i++){
			a[i]=sc.nextInt();
		}
		int even=0,odd=1,temp;
		while(even<n && odd<n){
			if(a[even]%2==0){
				even+=2;
			}else if(a[odd]%2==1){
				odd+=2;
			}else{
				temp=a[even];
				a[even]=a[odd];
				a[odd]=temp;
			}
		}
		System.out.print("OutPut : ");
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
	}
}
