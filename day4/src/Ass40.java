import java.util.Scanner;

public class Ass40 {
    public static void main(String[] args){
//        Q40. Write a Java program to check whether a character
//        is an alphabet, digit, or special character.
//        Input : Character = @
//                Output : Special Character
//        Explanation : Characters outside alphabets and digits are special characters.

        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the character :");
        char ch=sc.nextLine().charAt(0);
        if(ch>='a' && ch<='z' || ch>='A' && ch <='Z' || ch>='0' && ch<='9' ){
            System.out.println("Given character is not a special character !!");
        }else{
            System.out.println("Given character is a special character !!");
        }
    }
}
