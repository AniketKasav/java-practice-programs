/*Q27. Write a java program to Check If a Number Is a Happy Number or Not.
	Example : A number is called happy if it leads to 1 after a sequence of steps where 
	in each step number is replaced by the sum of squares of its digit, that is if we start with Happy Number
	and keep replacing it with digits square sum, we reach 1.
        	Input: n = 19
        	Output: True
        	19 is Happy Number,
        	1^2 + 9^2 = 82
        	8^2 + 2^2 = 68
        	6^2 + 8^2 = 100
        	1^2 + 0^2 + 0^2 = 1
        	As we reached 1, 19 is a Happy Number.*/
			
import java.util.*;
public class Ass27{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a numnber : ");
		int num=sc.nextInt();
		int rem,sum=0;
		while(num>0){
			rem=num%10;
			sum+=rem*rem;
			num/=10;
			if(num==0 && sum==1){
				System.out.println(sum);
				System.out.print("Given number is happy number ");
				break;
			}
			if(num==0 && sum==4){
				System.out.println(sum);
				System.out.print("Given number is not happy number ");
				break;
			}
			if(num==0){
				System.out.print(sum+"->");
				num=sum;
				sum=0;
			}
		}
		
		
	}
}


