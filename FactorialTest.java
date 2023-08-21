import java.util.Scanner;

public class FactorialTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Insert your number to calculate factorial :");
        int num = input.nextInt();
        System.out.println("Factorial of " + num + " is " + factorial(num));
    }

    /* You must define factorial as a "static" 
    for using it with static method like "main" */
    static long factorial(int N) {
            if (N == 1){
                return 1;
            } else {
                return N * factorial(N-1);
            }
    }
}
