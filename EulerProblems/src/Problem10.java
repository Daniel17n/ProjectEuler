import java.lang.Math;

public class Problem10 {
    public static void main(String[] args) {
        int n = 2000000;
        System.out.println(primesBelowN(n));
    }

    public static long primesBelowN(int n) {
        boolean isPrime, a;
        long sumPrimes = 0L;
        int possiblePrime = 2, divisor;

        for (int i = 1; possiblePrime < n; i++) {
            a = false;
            while (!a && possiblePrime < n) {
                divisor = 2;
                isPrime = true;
                while ((isPrime) && (divisor <= Math.floor(Math.sqrt(possiblePrime)))) {
                    if (possiblePrime % divisor == 0) isPrime = false;
                    else divisor = divisor + 1;
                }

                if (isPrime) {
                    sumPrimes += possiblePrime;
                    a = true;
                }
                possiblePrime = possiblePrime + 1;
            }
        }
        return sumPrimes;
    }
}
