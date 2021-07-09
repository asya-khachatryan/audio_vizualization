import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        int[] arr1 = {5, 6, 2, 1, 1, 9, 6, 34, 21, -3, 0, -35};
        System.out.println("Insertion Sorting");
        System.out.println("Before sorting:");
        System.out.println(Arrays.toString(arr1));

        SortingUtil.insertionSort(arr1);

        System.out.println("After sorting:");
        System.out.println(Arrays.toString(arr1));
        System.out.println();

        int[] arr2 = {5, 6, 2, 1, 1, 9, 6, 34, 21, -3, 0, -35};
        System.out.println("Quick Sorting");
        System.out.println("Before sorting:");
        System.out.println(Arrays.toString(arr2));

        SortingUtil.quickSort(arr2, 0, arr2.length-1);

        System.out.println("After sorting:");
        System.out.println(Arrays.toString(arr2));
    }
}
