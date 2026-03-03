import java.util.*;



public class Ass9 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
//        Q9. Write a java program to input any alphabet
//        and check whether it is vowel or consonant.

        System.out.print("Enter the alphabet : ");
        char ch=sc.nextLine().charAt(0);
        ch=Character.toLowerCase(ch);
//        System.out.println(ch);
        if(ch=='a' ||ch=='i'||ch=='u'||ch=='o'||ch=='e'){
            System.out.println("Given alphabet is vowel ");
        }else{
            System.out.println("Given alphabet is consonant ");
        }
    }
}
