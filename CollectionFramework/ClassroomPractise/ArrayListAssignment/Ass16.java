/*Q16.Problem Statement
 Write a Java program to store integer values in an ArrayList.
 Check each number and count how many numbers are prime.
Input:
 [2, 5, 8, 11, 15]
Output:
 Prime Count: 3
*/

import java.util.*;

public class Ass16{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the number of elements :");
		int n=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter numbers");
		ArrayList<Integer>ls=new ArrayList<>();
		for(int i=0;i<n;i++){
			ls.add(sc.nextInt());
		}
		
		int count=0;
		for(int num:ls){
			if(isPrime(num)){
				count++;
			}
		}
		
		System.out.println("Prime Count :"+count);
	}
	
	public static boolean isPrime(int num){
		for(int i=2;i*i<=num;i++){
			if(num%i==0) return false;
		}
		return true;
	}
}