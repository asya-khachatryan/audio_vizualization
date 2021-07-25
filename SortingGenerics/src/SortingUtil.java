import java.util.List;

public class SortingUtil {

    private SortingUtil() {
    }

    public static void insertionSort(List<Fruit> list) {
        for (int i = 1; i < list.size(); i++) {
            Fruit initial = list.get(i);
            int j = i - 1;
            while (j >= 0 && list.get(j).compareTo(initial) > 0) {
                list.set(j+1, list.get(j));
                j--;
            }
            list.set(j+1, initial);
        }
    }


    public static void quickSort(List<Fruit> list, int low, int high) {
        if (low < high) {
            int pivot = partition(list, low, high);
            quickSort(list, low, pivot - 1);
            quickSort(list, pivot + 1, high);
        }
    }

    private static int partition(List<Fruit> list, int begin, int end) {
        int pivot = end;

        int counter = begin;
        for (int i = begin; i < end; i++) {
            if (list.get(i).compareTo(list.get(pivot))<0) {
                swap(list, counter, i);
                counter++;
            }
        }
        swap(list, pivot, counter);

        return counter;
    }

    private static void swap(List<Fruit> list, int first, int second) {
        Fruit temp = list.get(first);
        list.set(first, list.get(second));
        list.set(second, temp);
    }

}
