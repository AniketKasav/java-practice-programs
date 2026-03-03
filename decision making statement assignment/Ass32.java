/*Q32. An automobile company manufactures both a two wheeler (TW) and a four wheeler (FW).
 A company manager wants to make the production of both types of vehicle according to the given data below:
• 1st data, Total number of vehicle (two-wheeler + four-wheeler)=v
• 2nd data, Total number of wheels = W
The task is to find how many two-wheelers as well as four-wheelers need to manufacture as per the given data.
Example :
Input : • 200 -> Value of V
• 540 -> Value of W
Output : • TW =130   FW=70
Explanation: 130+70 = 200 vehicles (70*4)+(130*2)= 540 wheels.

x+y=v
2*x+4*y=w 

x=v-y

2v-2y+4y=w
2v+2y=w
y=(w-2v)/2
x=v-y

*/

import java.util.Scanner;

public class Ass32{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of vehicles : ");
		int v=sc.nextInt();
		System.out.print("Enter the number of wheels : ");
		int w=sc.nextInt();
		
		int fw=(w-2*v)/2;
		int tw=v-fw;
		if(fw+tw==v && 2*tw+4*fw==w){
			System.out.printf("TW = %d  and fw = %d",tw,fw);
		}else{
			System.out.print("Invalid input");
		}
		
	}
}
