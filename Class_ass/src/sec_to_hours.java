import java.util.Scanner;

public class sec_to_hours {
    public static void main(String[] args){
        // Q. convert give seconds into hours : min : sec(remaining).

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the time in sec :");
        int sec=sc.nextInt();
        int hr=sec/3600;
        sec=sec-hr*3600;
        int min=sec/60;
        sec=sec-min*60;
        System.out.println("Hours : "+hr+", minutes : "+min+", seconds : "+sec+".");
    }
}
