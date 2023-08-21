public class CastingTest {
    public static void main(String[] args) {
        // Widening Casting (Auto)
        int a = 9;
        double b = a;

        // Narrowing Casting (Manual)
        double c = 9.8;
        int d = (int) c;

        System.out.println("Integer : " + a);
        System.out.println("After converting to double : " + b);
        System.out.println("Double : " + c);
        System.out.println("After converting to integer : " + d);
    }
}
