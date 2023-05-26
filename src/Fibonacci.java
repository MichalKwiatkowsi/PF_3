import java.math.BigInteger;

public class Fibonacci {
    public static BigInteger fib(int n) {
        BigInteger a = BigInteger.ZERO;
        BigInteger b = BigInteger.ONE;

        for (int i = 2; i <= n; i++) {
            BigInteger temp = b;
            b = a.add(b);
            a = temp;
        }

        return a;
    }

    public static void main(String[] args) {
        int n = 10000;
        BigInteger result = fib(n);
        System.out.println("Fib(" + n + "): " + result);
    }
}
