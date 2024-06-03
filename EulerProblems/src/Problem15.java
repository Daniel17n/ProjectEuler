import java.math.BigInteger;

public class Problem15 {
    private static final BigInteger RIGHT = new BigInteger("20");
    private static final BigInteger LEFT = new BigInteger("20");

    public static void main(String[] args) {
    System.out.printf("The number of paths for a %d x %d grid is %d", RIGHT, LEFT, factorial(RIGHT.add(LEFT)).divide(factorial(RIGHT).multiply(factorial(LEFT))));
    }

    public static BigInteger factorial(BigInteger number) {
        BigInteger result = BigInteger.valueOf(1);

        for (long factor = 2; factor <= number.longValue(); factor++) {
            result = result.multiply(BigInteger.valueOf(factor));
        }

        return result;
    }
}
