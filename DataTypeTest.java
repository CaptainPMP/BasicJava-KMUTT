public class DataTypeTest {
    public static void main(String[] args) {
        // Byte (-128 to 127)
        byte a = 100;

        // Short (-32768 to 32767)
        short b = 5000;

        // Int (-2147483648 to 2147483647)
        int c = 100000;

        // Long (-9223372036854775808 to 9223372036854775807)
        long d = 1500000000L;

        // Float (3.4e-038 to 3.4e+038)
        float e = 5.75f;

        // Double (1.7e-308 to 1.7e+308)
        double f = 19.99d;

        boolean isJavaFun = false;

        char g = 'B';

        String h = "Run . . .";

        System.out.println("Byte : " + a);
        System.out.println("Short : " + b);
        System.out.println("Int : " + c);
        System.out.println("Long : " + d);
        System.out.println("Float : " + e);
        System.out.println("Double : " + f);
        System.out.println("Boolean : " + isJavaFun);
        System.out.println("Char : " + g);
        System.out.println("String : " + h);
    }
}
