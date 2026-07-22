/*72. Implement your own version of `String.compareTo()`.

compareTo() performs lexicographical (dictionary-like) comparison of two strings.
Simple Logic
Compare characters one by one.
If different characters are found → return the difference between their character values.
If all compared characters are the same → return the difference between string lengths.
So:
Negative value → First string comes before second.
0 → Both strings are equal.
Positive value → First string comes after second.

Example 1: Different characters
Suppose:
String 1 = "Apple"
String 2 = "Banana"

Compare the first characters:
'A' = ASCII/Unicode value 65
'B' = ASCII/Unicode value 66

Calculate:
65 - 66 = -1
So the result is negative, meaning "Apple" comes before "Banana".

Example 2: First characters are the same
String 1 = "Cat"
String 2 = "Car"
Compare character by character:
C == C → continue
a == a → continue
t != r → difference found

Character values:
't' = 116
'r' = 114
116 - 114 = 2
The result is positive, so "Cat" comes after "Car".

Example 3: Same characters but different lengths
String 1 = "Java"
String 2 = "JavaScript"
First compare:
J == J
a == a
v == v
a == a
All available characters match, but "Java" is shorter.
Compare lengths:
4 - 10 = -6
So the result is negative, meaning "Java" comes before "JavaScript".  */

import java.util.Scanner;
public class Ass72{
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String1 :");
		String str1=sc.nextLine();
		System.out.println("Enter String2 :");
		String str2=sc.nextLine();
		int n=str1.length();
		int m=str2.length();
		int ans=0;
		boolean flag=true;
		for(int i=0;i<Math.min(n,m);i++){
			char ch1=str1.charAt(i);
			char ch2=str2.charAt(i);
			if(ch1!=ch2){
				ans=(int)(ch1-ch2);
				flag=false;
				break;
			}
		}
		if(flag){
			ans=n-m;
		}
		if(ans==0){
			System.out.println("Both strings are equal");
		}else if(ans<0){
			System.out.printf("%s comes before %s",str1,str2);
		}else{
			System.out.printf("%s comes after %s",str1,str2);
		}
	}
}