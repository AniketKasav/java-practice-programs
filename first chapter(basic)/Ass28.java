import java.util.Scanner;

public class net_salary28 {
    public static void main(String[] args){
//        Q28. Write a Java program to calculate the net salary of an employee.
//        Input:
//        Basic = 20000
//        HRA = 10%
//                DA = 5%
//                Tax = 2%
//                Output : Net Salary = 22600
//        Explanation : Allowances are added and tax is deducted.

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Basic pay :");
        double basic=sc.nextDouble();
        System.out.print("Enter the HRA :");
        double HRA=sc.nextInt();
        System.out.print("Enter the DA:");
        double DA=sc.nextInt();
        System.out.print("Enter the Tax :");
        double Tax=sc.nextInt();
        double net=basic+(basic*(HRA/100));
        net=net+(basic*(DA/100));
        net=net-(basic*(Tax/100));
        System.out.println("The Net Salary :"+(int)net);

    }
}
