//Q27. Write a java program to input marks of five subjects Physics, Chemistry, Biology,
//      Mathematics and Computer, calculate percentage and grade according to given conditions:
//                    	percentage >= 90% : Grade A
//                    	percentage >= 80% : Grade B
  //                  	percentage >= 70% : Grade C
    //                	percentage >= 60% : Grade D
      //              	percentage >= 40% : Grade E
        //            	percentage < 40% : Grade F
		
import java.util.Scanner;

public class Ass27{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the marks of Physics, Chemistry, Biology,Mathematics and Computer(out of 100)");
		int[] marks=new int[5];
		int sum=0;
		for(int i=0;i<5;i++){
			marks[i]=sc.nextInt();
			sum+=marks[i];
		}
		float percentage1=sum/5.0f;
		System.out.println("Percentage before round-off = "+percentage1);
		int percentage=Math.round(percentage1);
		System.out.println("Percentage after round-off = "+percentage);
		
		if(percentage >= 90){
			System.out.print("Grade A");
		}else if (percentage >= 80){
			System.out.print("Grade B");
			
		}else if(percentage >= 70){
			System.out.print("Grade C");
		}else if(percentage >= 60){
			System.out.print("Grade D");
		}else if(percentage >= 40){
			System.out.print("Grade E");
		}else if(percentage < 40){
			System.out.print("Grade F");
		}else{
			System.out.print("Invalid input !!");
		}
		
	}
}