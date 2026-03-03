import java.util.Scanner;

public class toggle_alphabet_using_ASCII_values {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the character :");
        char ch=sc.nextLine().charAt(0);
        if(ch>='A' && ch<='Z'){
            ch=(char)((int)ch+32);
//            int Ch=ch+32;
//        System.out.println((int)'a');
            System.out.println("Character in upper case :"+ch);
        }else if(ch>='a' && ch<='z'){
            ch=(char)((int)ch-32);
//            int Ch=ch-32;
//        System.out.println((int)'a');
            System.out.println("Character in upper case :"+ch);
        }

    }

}
