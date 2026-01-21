import java.util.Scanner;

public class Ass52 {
//    Q52.Write a Java program to find the middle value among
//    three distinct integers using ternary operator.
//    Input:
//    p = 10
//    q = 20
//    r = 15
//    Output : Middle Number = 15
//    Explanation : 15 lies between 10 and 20.

    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int p=sc.nextInt();
        System.out.print("Enter the second number : ");
        int q=sc.nextInt();
        System.out.print("Enter the third number : ");
        int r=sc.nextInt();
        int mid=p;
        if(p>=q && q<=r){
            mid=q;
        }
        if(p>=r && r<=q){
            mid=r;
        }
        System.out.println("Middle number = "+mid);

    }
}
