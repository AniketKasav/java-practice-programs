//wap to input no and check is duck number or not
// 1024-duck number(Contain zero)
//1234- not duck number 

import java.util.*;

public class Ass1{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in );
		System.out.print("Enter the number : ");
		int num=sc.nextInt();
		int digit;
		boolean flag=false;
		while(num>0){
			digit=num%10;
			if(digit==0){
				flag=true;
				break;
			}
			num/=10;
		}
		if(flag){
			System.out.print("given number is duck number !!");
		}else{
			System.out.print("given number is not duck number !!");
			
		}
		
	}
}