/*5. Convert Lowercase to Uppercase (No LeetCode)
Given a string containing lowercase letters, convert all characters into uppercase and return the
updated string.
Example: Input: "world" → Output: "WORLD"   */

class Ass5 {
    public static void main(String[] args) {

        String str = "world";
		String result="";
        for (int i = 0; i < str.length(); i++) {
            char ch=(char)(str.charAt(i)-32);
			result+=ch;
        }
		System.out.println("OutPut : "+result);
    }
}