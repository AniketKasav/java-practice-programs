import java.util.*;
public class Ass12{
	public static void main(String[] args){
		//Q12. Write a java program to read the age of a candidate and 
	    //determine whether he is eligible to cast his/her own vote.
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter youe age : ");
		int age=sc.nextInt();
		if(age>=18){
			System.out.print("Eligible for voting ");
		}else{
			System.out.print("Not Eligible for voting ");
		}
	}
}