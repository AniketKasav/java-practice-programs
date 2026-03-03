import java.util.Scanner;

public class Notes_conversion {
    public static void main(String[] args){
        //Q. convert the give amount into 500,200,100,50,20,10 notes and rupees.
        // e.g. 2761 -> 5 notes of 500 then 1 note of 200, 0 note of 100, 1 note of 50, 0 note of 20,
        //             1 note of 10, and 1 rupee(remaining).

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the amount :");
        int amount=sc.nextInt();
        int n500=amount/500;
        amount=amount-n500*500;
        int n200=amount/200;
        amount=amount-n200*200;
        int n100=amount/100;
        amount=amount-n100*100;
        int n50=amount/50;
        amount=amount-n50*50;
        int n20=amount/20;
        amount=amount-n20*20;
        int n10=amount/10;
        amount=amount-n10*10;
        System.out.println("notes of 500 :"+n500);
        System.out.println("notes of 200 :"+n200);
        System.out.println("notes of 100 :"+n100);
        System.out.println("notes of 50 :"+n50);
        System.out.println("notes of 20 :"+n20);
        System.out.println("notes of 10 :"+n10);
        System.out.println("Coins :"+amount);
        int total=n500+n200+n100+n50+n20+n10;
        System.out.println("Total notes "+total + " and "+amount+" coins");

    }
}
