import java.lang.Math;

public class Problem4 {
    public static void main(String[] args) {
        int largestPalindrome = 0;
        int startA = 100;
        int startB = 100;
        int limit = 1000;
        largestPalindrome = largestPalindromeProduct(startA, startB, limit, largestPalindrome);

    }

    public static int largestPalindromeProduct(int A, int B,int limit, int largestPalindrome) {
        int factor1 = 0, factor2 = 0;
        for (; A < limit; A++) {
            for (; B < limit; B++) {
                int possiblePalindrome = A * B;
                int aux = possiblePalindrome;
                int reversedPossiblePalindrome = 0;

                while(aux != 0) {
                    int digit = aux % 10;
                    reversedPossiblePalindrome = reversedPossiblePalindrome * 10 + digit;
                    aux /= 10;
                }

                if(reversedPossiblePalindrome == possiblePalindrome) {
                    if(largestPalindrome < possiblePalindrome) {
                        factor1 = A;
                        factor2 = B;
                        largestPalindrome = possiblePalindrome;
                    }
                }
            }
            B = 0;
        }
        System.out.printf("The largest palindrome for 2 digits is: %d * %d = %d", factor1, factor2, largestPalindrome);
        return largestPalindrome;
    }
}
