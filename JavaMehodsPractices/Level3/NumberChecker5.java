package JavaMehodsPractices.Level3;

public class NumberChecker5 {

    static int[] factors(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++)
            if (n % i == 0) count++;

        int[] f = new int[count];
        int idx = 0;
        for (int i = 1; i <= n; i++)
            if (n % i == 0) f[idx++] = i;

        return f;
    }

    static int greatestFactor(int[] f) {
        int max = f[0];
        for (int x : f) if (x > max) max = x;
        return max;
    }

    static int sumFactors(int[] f) {
        int s = 0;
        for (int x : f) s += x;
        return s;
    }

    static long productFactors(int[] f) {
        long p = 1;
        for (int x : f) p *= x;
        return p;
    }

    static double productCubeFactors(int[] f) {
        double p = 1;
        for (int x : f) p *= Math.pow(x, 3);
        return p;
    }

    static boolean isPerfect(int n, int[] f) {
        int sum = 0;
        for (int x : f) if (x != n) sum += x;
        return sum == n;
    }

    static boolean isAbundant(int n, int[] f) {
        int sum = 0;
        for (int x : f) if (x != n) sum += x;
        return sum > n;
    }

    static boolean isDeficient(int n, int[] f) {
        int sum = 0;
        for (int x : f) if (x != n) sum += x;
        return sum < n;
    }

    static boolean isStrong(int n) {
        int temp = n, sum = 0;
        while (temp > 0) {
            int d = temp % 10;
            int fact = 1;
            for (int i = 1; i <= d; i++) fact *= i;
            sum += fact;
            temp /= 10;
        }
        return sum == n;
    }
}
