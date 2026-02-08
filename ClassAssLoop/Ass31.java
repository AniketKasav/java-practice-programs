/* Q31. Write a java program to display 1 to nth Duck Number.
A duck number is a positive integer containing at least one zero (0)
 that does not appear as a leading digit. It can have zeros in the middle or at the end, 
 such as (302), (10045), or (7770). Numbers with only leading zeros (e.g., (0012))
 are not considered duck numbers, although (0120) is a duck number. */
 
 
import java.util.*;
public class Ass31{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the value of n to display 1 to nth Duck Number : ");
		int n=sc.nextInt();
		int rem,flag=0,temp;
		for(int i=1;i<=n;i++){
		temp=i	;
		while(temp>0){
			rem=temp%10;
			if(rem==0){
				System.out.print(i+" ");
				flag=1;
				break;
			}
			temp/=10;
		}
		}
		if(flag==0){
			System.out.printf("no duck number between 1 to %d .",n);
		}
		
	}
}