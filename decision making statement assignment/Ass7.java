import java.util.Scanner;

public class Ass7 {
    public static void main(String[] args){
//        Q7. Write a Java program to input cost price and selling price
//        of a product and check profit or loss.
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the cost price : ");
        int cp=sc.nextInt();
        System.out.print("Enter the selling price : ");
        int sp=sc.nextInt();
        if(sp>cp){
            System.out.printf("profit of %d",(sp-cp));
        }else{
            System.out.printf("loss of %d",(cp-sp));
        }


    }

}
