//Q36. Write a java program to find HCF (GCD) of two numbers.
/* The Greatest Common Divisor (GCD), or Highest Common Factor (HCF), 
of two numbers is the largest positive integer that divides both numbers without leaving a remainder.
 It is calculated using techniques like prime factorization, listing factors,
 or the efficient Euclidean Algorithm (\(gcd(a,b)=gcd(b,a\%b)\)).  */
 
import java.util.*;
public class Ass36{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter two number : ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		/*int result;
		if(a==b){
			System.out.print("gcd = "+a);
			return;
		}
		result = (a < b) ? a : b;
		while(result>0){
			if(a%result==0 && b%result==0){
				System.out.print("gcd = "+result);
				break;
			}
			result--;
		}*/
		/*Find GCD of 45 and 41  Euclidean Algorithm
		a=45 and b=41
		a = 45, b = 41
		45 % 41 = 4  → a = 41, b = 4
		41 % 4  = 1  → a = 4,  b = 1
		4 % 1   = 0  → a = 1,  b = 0

		GCD = a = 1
		*/
		//approach2
		int temp;
		while(b!=0){
			temp=b;
			b=a%b;
			a=temp;	
		}
		System.out.print("gcd = "+a);
	}
}