//51. Find the shortest word in a sentence.
/*Example

Input:

"The cat is sleeping on mat"

Words:

The → 3 letters
cat → 3 letters
is → 2 letters
sleeping → 8 letters
on → 2 letters
mat → 3 letters

Output:

is

(If multiple shortest words exist, some solutions return the first one found.)  */

import java.util.Scanner;
public class Ass51{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the sentence ");
		String str=sc.nextLine();
		String arr[]=str.trim().split("\\s+");
		int min=arr[0].length();
		int idx=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i].length()<min){
				min=arr[i].length();
				idx=i;
			}
		}
		System.out.println("shortest word in a sentence : "+arr[idx]);
		
	}
}
