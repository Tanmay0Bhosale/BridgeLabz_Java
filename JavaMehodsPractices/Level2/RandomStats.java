package JavaMehodsPractices.Level2;

public class RandomStats {
    static int[] generate4DigitRandomArray(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++)
            arr[i] = (int)(Math.random() * 9000) + 1000;
        return arr;
    }

    static double[] findAverageMinMax(int[] a) {
        int min = a[0], max = a[0], sum = 0;
        for (int x : a) {
            sum += x;
            min = Math.min(min, x);
            max = Math.max(max, x);
        }
        return new double[]{sum / (double)a.length, min, max};
    }

    public static void main(String[] args) {
        int[] arr = generate4DigitRandomArray(5);
        double[] r = findAverageMinMax(arr);

        System.out.println(r[0]);
        System.out.println(r[1]);
        System.out.println(r[2]);
    }
}
