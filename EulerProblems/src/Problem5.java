public class Problem5 {
    public static void main(String[] args) {
        int n = 1;
        int limit = 20;
        smallestMultiple(n, limit);
    }

    public static void smallestMultiple(int n, int limit) {
        boolean minimum = false;
        int score = 0;
        while (!minimum) {
            score = 0;
            for (int i = 1; i <= limit; i++) {
                if (n % i == 0) {
                    score++;
                    if (score == limit) {
                        System.out.println(n);
                        minimum = true;
                    }
                }
            }
            n++;
        }
    }
}
