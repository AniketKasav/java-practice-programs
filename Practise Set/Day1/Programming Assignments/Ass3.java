/*3. Count Vowels and Consonants (No LeetCode)
Given a string, count the total number of vowels and consonants present in it. Consider only
alphabetic characters while performing the count.
Example: Input: "apple" → Output: Vowels = 2, Consonants = 3   */

class Ass3 {
    public static void main(String[] args) {

        String str = "apple";
        int vowels = 0;
        int consonants = 0;
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            // Check only alphabet characters
            if (Character.isLetter(ch)) {
                // Check vowels
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

        System.out.println("Vowels = " + vowels);
        System.out.println("Consonants = " + consonants);
    }
}