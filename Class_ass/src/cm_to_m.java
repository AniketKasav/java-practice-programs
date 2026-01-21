import java.util.*;

public class cm_to_m {
//    Q. convert the centimeter into km, m and cm(remaining).
//    eg 2000142 = 2 km, 1m and 42 cm
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the distance in centimeter :");
        int d= sc.nextInt();
        int km=d/100000;
        d=d-km*100000;
        int m=d/100;
        d=d-m*100;
        int cm=d;
        System.out.println("kilometer :"+km);
        System.out.println("meter :"+m);
        System.out.println("centimeter :"+cm);

    }
}
