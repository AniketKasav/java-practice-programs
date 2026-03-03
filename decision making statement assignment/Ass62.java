//Q62. Write a menu-driven program in java using switch case.
//          	1.Check Number is positive , negative or zero.
//         	2.Check Number is even or odd.
//         	3.Write a java program to find the max number using 2 numbers.

import java.util.*;

public class Ass62 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int ch;

        do {
            System.out.println("\nMenu ...");
            System.out.println("1. Check number is positive, negative or zero");
            System.out.println("2. Check number is even or odd");
            System.out.println("3. Find the max number using 2 numbers");
            System.out.println("4. Exit");

            System.out.print("Enter your choice : ");
            ch = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.print("Enter the number : ");
                    int n = sc.nextInt();
                    if (n == 0) {
                        System.out.println("Given number is zero.");
                    } else if (n < 0) {
                        System.out.println("Given number is negative.");
                    } else {
                        System.out.println("Given number is positive.");
                    }
                    break;

                case 2:
                    System.out.print("Enter the number : ");
                    int a = sc.nextInt();
                    if (a % 2 == 0) {
                        System.out.println("Given number is even.");
                    } else {
                        System.out.println("Given number is odd.");
                    }
                    break;

                case 3:
                    System.out.print("Enter two numbers : ");
                    int b = sc.nextInt();
                    int c = sc.nextInt();
                    if (b > c) {
                        System.out.println(b + " is greater than " + c);
                    } else {
                        System.out.println(c + " is greater than " + b);
                    }
                    break;

                case 4:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (ch != 4);
    }
}
