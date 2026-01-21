import java.util.Scanner;

public class Ass56 {
//    Q56. Write a Java expression using arithmetic and assignment operators to calculate net salary.
//            Input:
//    Basic Salary = 35000
//    Tax Rate = 12%
//            Output : Net Salary = 30800
//    Explanation : Tax is deducted from basic salary.

    public static void main(String[] args){

     Scanner sc=new Scanner(System.in);
        System.out.print("Enter the basic salary : ");
        int b=sc.nextInt();
        System.out.print("Enter the rate : ");
        int r=sc.nextInt();
        double netSalary=b-b*((double)r/100);
        System.out.println("Net Salary : "+(int)netSalary);


    }
}
