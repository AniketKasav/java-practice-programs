/*Q17. Write a Java program to count the number of even and odd elements present in a given integer array.
Explanation
An even number is a number that is completely divisible by 2.
An odd number is a number that is not divisible by 2.
Traverse the array using a loop.
Input :- Array = { 10, 15, 20, 25, 30 }
Output :- Even count = 3
    Odd count = 2                         */
	
import java.util.Scanner;
public class Ass17{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the array size : ");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the array elements ");
		for(int i=0;i<a.length;i++){
			a[i]=sc.nextInt();
		}
		
		int evenCount=0,oddCount=0;
		for(int i=0;i<a.length;i++){
			if(a[i]%2==0){
				evenCount++;
			}else{
				oddCount++;
			}
		}
		
		System.out.println("Even count ="+evenCount);
		System.out.println("Odd count ="+oddCount);
	}
}