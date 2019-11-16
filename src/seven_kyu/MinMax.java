package seven_kyu;

public class MinMax {
    public static int[] minMax(int[] arr) {
        int min = arr[0];
        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            } else if (num < min) {
                min = num;
            }
        }
        return new int[]{min, max};
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int[] newArray = MinMax.minMax(array);
        for (int num : newArray) {
            System.out.println(num);
        }
    }
}
