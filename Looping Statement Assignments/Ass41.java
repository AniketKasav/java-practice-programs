/* Q41. Write a Java program to find the largest and smallest digit of a given number.
 Explanation:
 Use a while loop to extract digits, compare each digit to track max and min. */
 
import java.util.Scanner;
public class Ass41{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number to find the largest and smallest digit of a given number : ");
		int num=sc.nextInt();
		
		int min=num%10;
		int max=num%10;
		num=num/10;
		int rem;
		while(num>0){
			rem=num%10;
			if(rem>max){
				max=rem;
			}
			if(rem<min){
				min=rem;
			}
			num/=10;
		}
		System.out.printf("The Largest digit is %d and the Smallest digit is %d !!",max,min);
		
	}
}
 
