/*76. Decompress a compressed string.
Decompression is the opposite of string compression.

For example, if the compressed string is:
a3b2c2

The decompressed string will be:
aaabbcc                                  */

import java.util.Scanner;
public class Ass76{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string :");
		String str=sc.nextLine();
		int count=0;
		StringBuilder sb=new StringBuilder();
		
		for(int i=str.length()-1;i>0;i-=2){
			count=(int)(str.charAt(i)-'0');
			while(count!=0){
				sb.insert(0,str.charAt(i-1));
				count--;
			}
		}
		
		System.out.println("Result : "+sb);
		
	}
}