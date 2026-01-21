import java.util.Scanner;

public class Ass16 {
    public static void main(String[] args) {
//    Q16. Write a Java program to print the ASCII value of a given character.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the character :");
        char ch = sc.nextLine().charAt(0);
//        int ASCII=ch;
        System.out.printf("The ASCII value is :%d",(int)ch);
    }

}
