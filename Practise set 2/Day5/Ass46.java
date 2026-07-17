//46. Count the frequency of each word in a sentence.
/*Input Sentence
This is a test. This test is simple.
After Converting to Lowercase and Removing Punctuation
this is a test this test is simple
Word Frequencies
Word	Frequency
this	2
is		2
a		1
test	2
simple	1    */

import java.util.*;
public class Ass46{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sc.nextLine();
		str=str.toLowerCase().replaceAll("[^a-z\\s]","");
		HashMap<String,Integer>mp=new HashMap<>();
		String arr[]=str.split("\\s+");
		for(int i=0;i<arr.length;i++){
			mp.put(arr[i],mp.getOrDefault(arr[i],0)+1);
		}
		System.out.println("Word \tFrequencies");
		for(Map.Entry<String,Integer>entry: mp.entrySet()){
			System.out.println(entry.getKey()+"\t"+entry.getValue());
		}
	}
}



