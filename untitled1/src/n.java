import java.util.LinkedList;
import java.util.List;

public class n {
    public static void main(String[] args) {
        List<Integer> a = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            a.add(i);
        }
        System.out.println(a.toString());

        a.remove(5);
        System.out.println(a.toString());

        System.out.println(a.get(3));

        System.out.println(a.contains(4));
    }

}
