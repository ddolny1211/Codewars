package six_kuy;

import java.util.Arrays;

public class AreSame {

    // Verify is b[] have the same elements as in a[] squared
    // a[] or b[] cannot be null but the can be empty

    public static boolean comp(int[] a, int[] b) {
        if (a == null || b == null || a.length != b.length) {
            return false;
        }
        for (int i = 0; i < a.length; i++) {
            a[i] *= a[i];
        }
        Arrays.sort(a);
        Arrays.sort(b);
        boolean isSquare = true;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                isSquare = false;
            }
        }
        return isSquare;
    }

    public static void main(String[] args) {
        int[] a = {0, 1, -1, 2}; // -1 0 0 2
        int[] b = {4, 1, 1, 0};  // 0 1 1 4
        System.out.println(AreSame.comp(a, b));
    }
}
