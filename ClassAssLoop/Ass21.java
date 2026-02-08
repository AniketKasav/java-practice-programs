//Q21.  Write a java program to check Number Is Prime Number or Not.

import java.util.*;
public class Ass21{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a numnber : ");
		int num=sc.nextInt();
		boolean flag=true;
		if (num <= 1) {
            flag = false;
        } else {
            for (int i = 2; i * i <= num; i++) {
                if (num % i == 0) {
                    flag = false;
                    break;
                }
            }
        }
		
		if(flag){
			System.out.print("number is prime");
		}else{
			System.out.print("number is not prime");
			
		}
	}
}

