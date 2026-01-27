//Q14. Write a java program to input the basic salary of an employee and calculate its Gross salary according to the following.
//                               	Basic Salary <= 10000 : HRA = 20%, DA = 80%
//                              	Basic Salary <= 20000 : HRA = 25%, DA = 90%
//                              	Basic Salary > 20000 : HRA = 30%, DA = 95%
// gross salary= basic salary+HRA+DA
import java.util.Scanner;
public class Ass14{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the basic salary : ");
		float bs=sc.nextFloat();
		float hra,da;
		if(bs<=10000){
			hra=bs*(20/100f);
			da=bs*(80/100f);
		}else if(bs<=20000){
			hra=bs*(25/100f);
			da=bs*(90/100f);
		}else{
			hra=bs*(30/100f);
			da=bs*(95/100f);
		}
		float gs=bs+hra+da;
		System.out.println("hra : "+hra);
		System.out.println("da : "+da);
		System.out.println("Gross Salary : "+gs);
	}
}