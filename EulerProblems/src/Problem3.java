import static java.lang.Math.sqrt;

public class Problem3 {
    public static void main(String[] args) {
        double n = 600851475143.00;
        double answer = 0;

        LargestPrimeFactor(n, answer);
    }

    public static void LargestPrimeFactor(double n, double answer) {
        for (int i = 1; i < sqrt(n); i++) {
            if(n%i == 0) {
                if(isPrime(i)) {
                    if(answer < i) {
                        answer = i;
                    }
                }
            }
        }
        System.out.println(answer);
    }

    static boolean isPrime(double candidate) {
        boolean isPrime = true;
        if (candidate == 0 || candidate == 1 || candidate == 4) isPrime = false;
        for (int x = 2; x < candidate / 2; x++) {
            if (candidate % x == 0) isPrime = false;
        }
        return isPrime;
    }
}
