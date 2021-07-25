import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<Fruit> fruits1 = new ArrayList<>();

        Fruit apple = new Fruit(8, "Apple");
        Fruit pear = new Fruit(10, "Pear");
        Fruit peach = new Fruit(3, "Peach");
        Fruit apricot = new Fruit(7, "Apricot");
        Fruit orange = new Fruit(12, "Orange");

        fruits1.add(apple);
        fruits1.add(pear);
        fruits1.add(peach);
        fruits1.add(apricot);
        fruits1.add(orange);

        System.out.println("Insertion Sorting");
        System.out.println("Before sorting:");
        System.out.println(fruits1.toString());

        SortingUtil.insertionSort(fruits1);

        System.out.println("After sorting:");
        System.out.println(fruits1.toString());
        System.out.println();

        List<Fruit> fruits2 = new ArrayList<>();

        Fruit banana = new Fruit(8, "Banana");
        Fruit kiwi = new Fruit(10, "Kiwi");
        Fruit pomelo = new Fruit(3, "Pomelo");
        Fruit mango = new Fruit(7, "Mango");
        Fruit grapefruit = new Fruit(12, "Grapefruit");

        fruits2.add(banana);
        fruits2.add(kiwi);
        fruits2.add(pomelo);
        fruits2.add(mango);
        fruits2.add(grapefruit);

        System.out.println("Quick Sorting");
        System.out.println("Before sorting:");
        System.out.println(fruits2.toString());

        SortingUtil.quickSort(fruits2, 0, fruits2.size() - 1);

        System.out.println("After sorting:");
        System.out.println(fruits2.toString());
    }
}
