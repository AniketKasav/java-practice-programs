/* Q46. Write a Java program to display all Twin Primes between 1 and n.
 Twin Primes are pairs of prime numbers that differ by 2.
 Example: (3, 5), (5, 7), (11, 13).
Explanation:
 Use loops:
First, loop through numbers from 2 to n.
For each, check if it and the next number +2 are both prime using an inner loop.
If both are prime, print the pair. */


import java.util.Scanner;
public class Ass46{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number to display all Twin Primes between 1 and n : ");
		int num=sc.nextInt();
		int temp;
		boolean prime;
		for(int i=2;i<=num;i++){
			temp=i;
			prime=true;
			for(int j=2;j*j<=temp;j++){
				if(temp%j==0){
					prime=false;
					break;
				}	
			}
			if(prime){
				temp+=2;
				for(int j=2;j*j<=temp;j++){
				if(temp%j==0){
					prime=false;
					break;
				}	
			}
			if(prime){
				System.out.printf("(%d,%d)",i,(i+2));
			}	
				
			}
		}
	}
}


