package JavaMehodsPractices.Level3;

public class NumberChecker3 {

    static int[] reverse(int[] d) {
        int[] r = new int[d.length];
        for (int i = 0; i < d.length; i++)
            r[i] = d[d.length - 1 - i];
        return r;
    }

    static boolean compareArrays(int[] a, int[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++)
            if (a[i] != b[i]) return false;
        return true;
    }

    static boolean isPalindrome(int[] d) {
        return compareArrays(d, reverse(d));
    }

    static boolean isDuck(int[] d) {
        for (int x : d) if (x == 0) return true;
        return false;
    }
}
