import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {5, 6, 2, 1, 1, 9, 6, 34, 21, -3, 0, -35};
        System.out.println("Before sorting:");
        System.out.println(Arrays.toString(arr));

        insertionSort(arr);

        System.out.println("After sorting:");
        System.out.println(Arrays.toString(arr));

    }

    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int initial = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > initial) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = initial;
        }
    }
}
