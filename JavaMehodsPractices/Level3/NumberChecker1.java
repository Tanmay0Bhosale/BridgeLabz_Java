package JavaMehodsPractices.Level3;

public class NumberChecker1 {

    static int countDigits(int n) {
        return String.valueOf(n).length();
    }

    static int[] getDigits(int n) {
        int[] d = new int[countDigits(n)];
        for (int i = d.length - 1; i >= 0; i--) {
            d[i] = n % 10;
            n /= 10;
        }
        return d;
    }

    static boolean isDuck(int[] d) {
        for (int x : d) if (x == 0) return true;
        return false;
    }

    static boolean isArmstrong(int n, int[] d) {
        int p = d.length, sum = 0;
        for (int x : d) sum += Math.pow(x, p);
        return sum == n;
    }

    static int[] largestSecondLargest(int[] d) {
        int max = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
        for (int x : d) {
            if (x > max) { second = max; max = x; }
            else if (x > second && x != max) second = x;
        }
        return new int[]{max, second};
    }

    static int[] smallestSecondSmallest(int[] d) {
        int min = Integer.MAX_VALUE, second = Integer.MAX_VALUE;
        for (int x : d) {
            if (x < min) { second = min; min = x; }
            else if (x < second && x != min) second = x;
        }
        return new int[]{min, second};
    }
}
