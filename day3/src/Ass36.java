import java.util.Scanner;

public class Ass36 {
    public static void main(String[] args){
//        Q36. Write a Java program to check whether
//        a character is an alphabet or not.

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the character : ");
        char ch=sc.nextLine().charAt(0);
        if(ch>='A' && ch<='Z' || ch>='a' && ch<='z'){
            System.out.println("Given character is an Alphabet");
        }else{
            System.out.println("Given character is not an Alphabet");

        }

    }
}
