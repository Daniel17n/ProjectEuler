import java.lang.Math;

public class Problem6 {
    public static void main(String[] args) {
        int limit = 100;
        System.out.println("The difference between the sum of the squares of the first ten natural numbers and the square of the sum is: ");
        System.out.println(sumOfNFirstNumbersSquared(limit) + " - " + sumSquaresOfNFirstNumbers(limit) + " = " + (sumOfNFirstNumbersSquared(limit) - sumSquaresOfNFirstNumbers(limit)));
    }


    public static int sumSquaresOfNFirstNumbers(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += Math.pow(i, 2);
        }
        return sum;
    }
    public static int sumOfNFirstNumbersSquared(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        int sumSquared = (int)Math.pow(sum, 2);
        return sumSquared;
    }

}
