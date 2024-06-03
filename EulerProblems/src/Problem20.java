import java.math.BigInteger;

public class Problem20 {
    public static void main(String[] args) {
        BigInteger bgInt = new BigInteger("100");
        BigInteger total = calculateFactorial(bgInt);
        String totalString = total.toString();
        System.out.println(countDigits(totalString));
    }

    private static int countDigits(String totalString) {
        int count = 0;
        String[] parts = totalString.split("");
        for (int i = 0; i < totalString.length(); i++) {
            count += Integer.parseInt(parts[i]);
        }
        return count;
    }

    private static BigInteger calculateFactorial(BigInteger n) {
        if (n.equals(new BigInteger("0")) || n.equals(new BigInteger("1")))
            return new BigInteger("1");
        else
            return (BigInteger) calculateFactorial(n.add(new BigInteger("-1"))).multiply(n);
    }


}
