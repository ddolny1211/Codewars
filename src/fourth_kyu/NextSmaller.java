package fourth_kyu;

import java.util.ArrayList;
import java.util.List;

public class NextSmaller {
    public static long nextSmaller(long n) {
        List<Long> arrayOfDigits = new ArrayList<>();
        long number;
        while (n > 0) {
            number = n % 10;
            arrayOfDigits.add(number);
            n /= 10;
        }
        long[] array = new long[arrayOfDigits.size()];
        for (int i = 0; i < array.length; i++) {
            array[i] = arrayOfDigits.get(i);
        }
        System.out.println(array.length);
        return n;
    }

    static int printMaxNum(int num) {
        // hashed array to store count of digits
        int count[] = new int[10];

        // Converting given number to string
        String str = Integer.toString(num);

        // Updating the count array
        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i) - '0']++;
        }

        // result is to store the final number
        int result = 0, multiplier = 1;

        // Traversing the count array
        // to calculate the maximum number
        for (int i = 0; i <= 9; i++) {
            while (count[i] > 0) {
                result = result + (i * multiplier);
                count[i]--;
                multiplier = multiplier * 10;
            }
        }

        // return the result
        return result;
    }

    public static void main(String[] args) {
        NextSmaller.nextSmaller(54352257);

    }
}
