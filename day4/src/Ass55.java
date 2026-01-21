import java.util.Scanner;

public class Ass55 {
//    Q55. Write a java program to check whether the
//    middle digit is greater than the sum of first and last digits.
//    Input : Number = 853
//    Output : Not Greater
//    Explanation : Middle digit 5 < (8 + 3).

//   solution for only three-digit number

    public static void main(String[] args){

        Scanner sc= new Scanner(System.in);
        System.out.print("enter the three digit number : ");
        int n=sc.nextInt();
        int l=n%10;
        int f=n/100;
        int m=(n/10)%10;
        System.out.println(l+f<m?"Greater !!":
                "Not Greater !!");

    }


}
