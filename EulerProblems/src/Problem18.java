public class Problem18 {
    private static final int[][] triangle = {
        {75},
        {95, 64},
        {17, 47, 82},
        {18, 35, 87, 10},
        {20,  4, 82, 47, 65},
        {19,  1, 23, 75,  3, 34},
        {88,  2, 77, 73,  7, 63, 67},
        {99, 65, 04, 28,  6, 16, 70, 92},
        {41, 41, 26, 56, 83, 40, 80, 70, 33},
        {41, 48, 72, 33, 47, 32, 37, 16, 94, 29},
        {53, 71, 44, 65, 25, 43, 91, 52, 97, 51, 14},
        {70, 11, 33, 28, 77, 73, 17, 78, 39, 68, 17, 57},
        {91, 71, 52, 38, 17, 14, 91, 43, 58, 50, 27, 29, 48},
        {63, 66,  4, 68, 89, 53, 67, 30, 73, 16, 69, 87, 40, 31},
        {04, 62, 98, 27, 23,  9, 70, 98, 73, 93, 38, 53, 60,  4, 23}
    };

    public static void main(String[] args) {
        System.out.println("The maximum path sum is: " + maximumPathSumII(triangle));
    }



    public static int maximumPathSumI(int[][] triangle) {
        int path = 0;
        int sum = triangle[0][path];
        for (int i = 1; i < triangle.length; i++) {
            if (triangle[i][path] > triangle[i][path + 1]) {
                sum +=triangle[i][path];
            } else if (triangle[i][path] < triangle[i][path + 1]) {
                sum += triangle[i][path + 1];
                path++;
            } else {
                if (triangle[i + 1][path] > triangle[i + 1][path + 2]) {
                    sum += triangle[i][path];
                } else {
                    sum += triangle[i][path + 1];
                    path++;
                }
            }
        }
        return sum;
    }

    public static int maximumPathSumII(int[][] triangle) {
        for (int i = triangle.length - 2; i >= 0; i--) {
            for (int j = 0; j < triangle[i].length; j++) {
                triangle[i][j] += Math.max(triangle[i+1][j], triangle[i+1][j+1]);
            }
        }
        return Integer.valueOf(triangle[0][0]);
    }
}
