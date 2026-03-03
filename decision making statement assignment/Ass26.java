//Q26.Write a java program to accept the height of a person in centimeters and categorize the person according to their height.
  //                     PerHeight < 150.0  : The person is Dwarf. 
    //                   PerHeight >= 150.0 && PerHeight < 165.0  :   The person is  average heighted.
      //                 PerHeight >= 165.0 && PerHeight <= 195.0 :  The person is taller.
 //
   //                    Test Data : 135
  //
    //              	Expected Output :	The person is Dwarf
	
import java.util.Scanner;

public class Ass26{
	public static void main(String[] args){
		System.out.print("Enter the height in cm : ");
		Scanner sc=new Scanner(System.in);
		int PerHeight=sc.nextInt();
		if(PerHeight < 150){
			System.out.print("The person is Dwarf.");
		}else if (PerHeight >= 150 && PerHeight < 165){
			System.out.print("The person is  average heighted.");
			
		}else if(PerHeight >= 165 && PerHeight <= 195){
			System.out.print("The person is taller.");
		}else{
			System.out.print("The person is tallest.");
			
		}
		
	}
}