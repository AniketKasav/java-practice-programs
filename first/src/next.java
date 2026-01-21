import java.util.Scanner;

public class next {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the income :");
        int income=sc.nextInt();
//        int income=123456789;
        String className=income>100_000?"firstClass":"Economy";
        System.out.println(className);


    }
}
