import java.lang.Math;

public class Problem9 {
    public static void main(String[] args) {
        int a = 0, b, c;
        for (; a < 1000; a++) {
            b = 0;
            for (; b < 1000; b++) {
                c = 0;
                for (; c < 1000; c++) {
                    if (a + b + c == 1000 && Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2) && a < b && b < c) {
                        System.out.printf("The solution to the problem is a = %d, b = %d, c = %d and  a*b*c = %d", a, b, c, a * b * c);
                    }
                }
            }
        }
    }
}
