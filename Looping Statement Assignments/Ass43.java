/*Q43. Write a Java program to check whether a given number is a Disarium number or not, and display all Disarium numbers up to n.
 A Disarium number is a number whose sum of its digits powered with their respective positions is equal to the number itself.
 Example: 135 is a Disarium number because 1¹ + 3² + 5³ = 1 + 9 + 125 = 135.
Explanation:
 Use a loop to count digits. Use another loop to extract each digit and 
 calculate the digit raised to its position power using only loops (no Math.pow()).
 Check if the sum equals the original number.  */
 
import java.util.Scanner;
public class Ass43	{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number to display all Disarium numbers from 1 to n : ");
		int num=sc.nextInt();
		int temp,rnum,p,sum,rem,power;
		for(int i=1;i<=num;i++){
			temp=i;
			rnum=0;
			while(temp>0){
				rnum=rnum*10+(temp%10);
				temp/=10;
			}
			p=0;
			sum=0;
			/*while(rnum>0){
				rem=rnum%10;
				p++;
				sum+=(int)Math.pow(rem,p);
				rnum/=10;
			}*/
			
			while(rnum>0){
				p++;
				power=1;
				rem=rnum%10;
				for(int j=1;j<=p;j++){
					power*=rem;
				}
				sum+=power;
				rnum/=10;
			}
			
			if(sum==i){
				System.out.print(i+" ");
			}
				
		}
	}
}