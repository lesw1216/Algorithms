package divideAndConquer.mergeSort;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] a = new int[]{3, 2, 4, 5};
        int[] b = new int[]{4, 1, 2, 9};
        System.arraycopy(a, 2, b, 2, a.length - 2);
        System.out.println(Arrays.toString(b));
        System.out.println(Arrays.toString(a));
    }
}
