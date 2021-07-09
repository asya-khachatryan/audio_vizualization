import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        int[] arr = {5, 6, 2, 1, 1, 9, 6, 34, 21, -3, 0, -35};
        System.out.println("Before sorting:");
        System.out.println(Arrays.toString(arr));

        quickSort(arr, 0, arr.length-1);

        System.out.println("After sorting:");
        System.out.println(Arrays.toString(arr));

    }

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivot = partition(arr, low, high);
            quickSort(arr, low, pivot - 1);
            quickSort(arr, pivot + 1, high);
        }
    }

    public static int partition(int[] array, int begin, int end) {
        int pivot = end;

        int counter = begin;
        for (int i = begin; i < end; i++) {
            if (array[i] < array[pivot]) {
                int temp = array[counter];
                array[counter] = array[i];
                array[i] = temp;
                counter++;
            }
        }
        int temp = array[pivot];
        array[pivot] = array[counter];
        array[counter] = temp;

        return counter;
    }

}
