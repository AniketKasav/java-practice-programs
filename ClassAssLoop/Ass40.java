/* Q40. Write a Java program to print all automorphic numbers between 1 and n.
 An automorphic number’s square ends with the number itself (e.g., 5² = 25).
 25^2=625     (cpmpare the number not the only last digit)
 Explanation:
 Use loop to check square and a while loop to match last digits. */
 
import java.util.Scanner;

public class Ass40{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number to print all automorphic numbers between 1 and n : ");
		int num=sc.nextInt();
		int temp,square;
		for(int i=1;i<=num;i++){
			temp=i;
			square=i*i;
			boolean isautomorphic=true;
			while(temp>0){
				if(temp%10!=square%10){
					isautomorphic=false;
					break;
				}
				temp=temp/10;
				square=square/10;
			}
			if(isautomorphic){
				System.out.print(i+" ");
			}
		}	
	}
}
