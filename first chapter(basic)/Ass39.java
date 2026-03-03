import java.util.Scanner;

public class vowel_or_consonant {
    public static void main(String[] args){
//        Q39. Write a Java program to input an alphabet and check whether it is a vowel or consonant.
//        Input : Alphabet = e
//        Output : Vowel
//        Explanation : Vowels include a, e, i, o, u.

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the alphabet : ");
        char ch=sc.nextLine().charAt(0);
//        char []arr={'a','e','i','o','u'};
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
            System.out.println("The given alphabet is Vowel");
        }else{
            System.out.println("The given alphabet is consonant");

        }



    }
}
