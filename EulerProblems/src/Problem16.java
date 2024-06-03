import java.lang.Math;
import java.math.BigInteger;

public class Problem16 {
    public static void main(String[] args) {
        int base = 2;
        int exp = 1000;
        int sum = 0;
        BigInteger number = new BigInteger(String.valueOf(base));
        BigInteger power = number.pow(exp);

        String powerInString = String.valueOf(power);

        sum = sumDigits(powerInString);
        System.out.printf("2 to the power of %d is %d,\nand the sum of its digits is %d\n", exp, power, sum);
    }

    public static int sumDigits(String powerInString) {
        int length = powerInString.length();
        int sum = 0;
        int temp = 0;
        for (int i = 0; i < length; i++) {
            temp = powerInString.charAt(i) - 48;
            sum += temp;
        }
        return sum;
    }
}
