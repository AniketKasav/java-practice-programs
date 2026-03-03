/*Q45. Write a Java program to print all Pronic numbers between 1 and n.
 A Pronic number is the product of two consecutive integers, i.e., n(n+1).
 Example: 2 (1×2), 6 (2×3), 12 (3×4) etc.
Explanation:
 Use a loop to check for each number from 1 to n. For each, use another loop to find if it can be expressed as x*(x+1).  */
 
import java.util.Scanner;
public class Ass45{
public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number to print all Pronic numbers between 1 and n : ");
		int num=sc.nextInt();
		int temp;
		for(int j=1;j<=num;j++){
			for(int i=1;i<=j/2;i++){
				if(i*(i+1)==j){
					System.out.print(j+" ");
				}
			}
		}
}
}