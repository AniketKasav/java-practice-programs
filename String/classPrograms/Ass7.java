//7 Example: WAP to input string and check string is anagram or not 

// time complexity o(n logn)  this is not optimal solution the frequency count is optimal approach for this problem tc o(n)

/*import java.util.*;
public class Ass7{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the String 1: ");
		String str1=sc.nextLine();
		System.out.print("Enter the String 2: ");
		String str2=sc.nextLine();
		
		str1=str1.toLowerCase().replaceAll("\\s","");
		str2=str2.toLowerCase().replaceAll("\\s","");
		if(str1.length()!=str2.length()){
			System.out.println("string is not anagram");
			return;
		}
		char arr1[]=str1.toCharArray();
		char arr2[]=str2.toCharArray();
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		if(Arrays.equals(arr1,arr2)){
			System.out.println("string is anagram");
		}else{
			System.out.println("string is not anagram");
			
		}
	}
}*/

// this approach is using the array to count and used for alpha and digit and spacial characters 
// we can also use HashMap for frequency count havind TC O(n);



import java.util.*;    //TC O(256);
public class Ass7{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the String 1: ");
		String str1=sc.nextLine();
		System.out.print("Enter the String 2: ");
		String str2=sc.nextLine();
		
		str1=str1.toLowerCase().replaceAll("\\s","");
		str2=str2.toLowerCase().replaceAll("\\s","");
		if(str1.length()!=str2.length()){
			System.out.println("string is not anagram");
			return;
		}
		int count[]=new int[256];
		for(int i=0;i<str1.length();i++){
			count[(int)str1.charAt(i)]++;
			count[(int)str2.charAt(i)]--;
		}
		boolean flag=true;
		for(int i=0;i<count.length;i++){
			if(count[i]!=0){
				flag=false;
				break;
			}
		}
		if(flag){
			System.out.println("string is anagram");
		}else{
			System.out.println("string is not anagram");
			
		}
	}
}