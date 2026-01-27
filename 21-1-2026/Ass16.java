import java.util.Scanner;

public class Ass16{
	//Q16. Write a java program to find a minimum between three numbers.
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the three numbers ");
	int a=sc.nextInt();
	int b=sc.nextInt();
	int c=sc.nextInt();
	
	int min=a;
	if(b<min)min=b;
	if(c<min)min=c;
	System.out.print("Minimum : "+min);

	}

}