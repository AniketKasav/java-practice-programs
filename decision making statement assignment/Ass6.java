import java.util.Scanner;

public class Ass6 {
//    Q6. Write a Java program to check whether a character is alphabetic or not.
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the character for keyboard : ");
        char ch=sc.nextLine().charAt(0);
        if(ch>='A'&&ch<='Z' || ch>='a'&&ch<='z'){
            System.out.println("The given character is alphabet !!");
        }else{
            System.out.println("Not alphabet");
        }

    }



}

