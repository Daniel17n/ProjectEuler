public class Problem2 {
    public static void main(String[] args) {
        int a = 1, b = 1, c, result = 0;
        while(a < 4000000) {
            c = a + b;
            a = b;
            b = c;
            if(a%2 == 0) result = result + a;
        }
        System.out.println(result);
    }
}