public class BitwiseOperator {
    public static void main(String[] args) {
        // Bitwise Operator
        //Bitwise OR AND
        int a = 5, b = 6;
        int c = a | b;
        System.out.println("Bitwise OR :" + c);
        int d = a & b;
        System.out.println("Bitwise AND :" + d);

        //Left shift operator
        int e = a << 2;
        System.out.println("Left shift 5<<2 :" + e);

        //Right shift operator
        int f = b >> 2;
        System.out.println("Right shift 6>>2 :" + f);

//        XOR operator
        int g=a^b;
        System.out.println("XOR 5^6 :"+g);

//        One’s complement
        int h=~a;
        System.out.println("One’s complement ~5 : "+h);
        int i=~-5;
        System.out.println("One’s complement ~-5 : "+i);


    }
}
