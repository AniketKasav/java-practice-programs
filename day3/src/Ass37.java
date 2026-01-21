import java.util.Scanner;

public class Ass37 {
//    Q37. Write a Java program to input cost price and selling price and determine profit or loss.
//    Input:
//    Cost Price = 500
//    Selling Price = 650
//    Output : Profit
//    Explanation : Selling price is greater than cost price.

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the cost price :");
        int cp=sc.nextInt();
        System.out.print("Enter the Selling price :");
        int sp=sc.nextInt();
        if(sp==cp){
            System.out.println("No profit or lose");
            return;
        }
        if(sp>cp){
            System.out.println("Profit");
        }else{
            System.out.println("Lose");
        }

    }

}
