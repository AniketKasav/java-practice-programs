//1. All Basic String Methods
// Note : String is immutable
/*
int length();
char charAt(int index)
String toUpperCase()
String toLowerCase()
String concat(String)
boolean endsWith(String)
boolean startsWith(String)
String substring(int startindex)
String substring(int statIndex,int endIndex)
String trim()
char [] toCharArray()
String replace()
int indexOf(String)
int lastIndexOf(String)
String [] split(String)
                                 */

public class Ass1{
	public static void main(String[] args){
		String str="Aniket";
		System.out.println("Given string is : "+str);
		System.out.println("Length of the string is : "+str.length());
		System.out.println("Character at index 4 : "+str.charAt(4));
		//str.toUpperCase();           String is immutable and hence it create a new object and display directly or store in anpthere 
		// 								varible 
		//System.out.println("UpperCase : "+str);
		String str1=str.toUpperCase();
		System.out.println("UpperCase : "+str1);
		System.out.println("LowerCase : "+str1.toLowerCase()); // here i direclt print the return object 
		System.out.println("endsWith 'et'(return true/false) Aniket : "+str.endsWith("et"));
		System.out.println("startsWith 'an'(return true/false) Aniket :"+str.startsWith("an"));
		System.out.println("substring(4) 4 is StartingIndex and upto end: "+str.substring(4));
		System.out.println("substring(2,5) 2 is StartingIndex and upto 5: "+str.substring(2,5));
		System.out.println("Concat the two String str.concat(str1) :"+str.concat(str1));
		String str2=new String("     AK    ");
		System.out.println("String to perform trim op : "+str2);
		System.out.println("Remove the leading the trailing white spaces str.trim() : "+str2.trim());
		System.out.println("Convert the string in char array using str.toCharArray() method ");
		char arr[]=str.toCharArray();
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		String replaceString="###Aniket###";
		System.out.println("\n"+replaceString);
		System.out.println("\nReplace the string with another string using str.replace('Str1','Str2'): "+replaceString.replace("#","@"));
		String Firststring="Good Morning, Have a Nice Day !!";
		System.out.println(Firststring);
		System.out.println("Get the index of first occurance of the string 'Have' using str.indexOf('have') :"+Firststring.indexOf("Have"));
		String laststring="abcabc";
		System.out.println(laststring);
		System.out.println("Get the index of last occurance of the string 'Have' using str.LastIndexOf('have') :"+laststring.lastIndexOf("b"));
		String text = "one,one,two,two,three";
		System.out.println(text);
		String SplitArr[]=text.split(",");
		for(int i=0;i<SplitArr.length;i++){
			System.out.print(SplitArr[i]+" ");
		}
		
	}
}