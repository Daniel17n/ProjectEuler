public class Problem7 {
    public static void main(String[] args) {
        int n = 10001;
        int nthPrime = nthPrime(n);

        System.out.printf("El primo numero %d es %d.", n, nthPrime);
    }

    public static int nthPrime(int n) {
        boolean isPrime, a;
        int nPrimes = 0, possiblePrime = 2, divisor;

        for (int i = 1; i <= n; i++) {
            a = false;
            while (!a) {
                divisor = 2;
                isPrime = true;
                while ((isPrime) && (divisor < possiblePrime)) {
                    if (possiblePrime % divisor == 0) isPrime = false;
                    else divisor = divisor + 1;
                }

                if (isPrime) {
                    nPrimes = nPrimes + 1;
                    if (nPrimes == n) {
                        return possiblePrime;
                    }
                    a = true;
                }
                possiblePrime = possiblePrime + 1;
            }
        }
        return possiblePrime;
    }
}
