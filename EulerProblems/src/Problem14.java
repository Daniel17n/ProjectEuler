public class Problem14 {
    public static void main(String[] args) {
        int starting = 2;
        int limit = 1000000;
        double number = starting;
        int biggestSize = 0, size = 0, biggestN = 0;
        for (; starting < limit; starting++) {
            number = starting;
            size = 0;
            while (number != 1) {
                if (isEven(number)) {
                    number = number / 2;
                    size++;
                }
                else {
                    number = 3 * number + 1;
                    size++;
                }
            }
            if (biggestSize < size) {
                biggestSize = size;
                biggestN = starting;
            }
        }
        System.out.printf("The longest chain of number under 1.000.000 is %d with a chain of %d", biggestN, biggestSize);
    }

    public static boolean isEven(double n) {
        return (n%2 == 0);
    }
}
