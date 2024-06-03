public class Problem12 {
    public static void main(String[] args) {
        int threshold = 1;
        for (; nFactors(sumNfirstNumbers(threshold)) <= 500; threshold++) {
            System.out.printf("%d: %d\n", sumNfirstNumbers(threshold), nFactors(sumNfirstNumbers(threshold)));
        }
        System.out.printf("The first triangle number to have 500+ divisors is %d\n",sumNfirstNumbers(threshold));
    }

    public static int sumNfirstNumbers(int threshold) {
        int total = 0;
        for (int i = 1; i <= threshold; i++) {
            total += i;
        }
        return total;
    }

    public static int nFactors(int n) {
        int nDivisors = 0;
        for (int i = 1; i <= n; i++) {
            if(n%i == 0) {
                nDivisors += 1;
            }
        }
        return nDivisors;
    }
}
