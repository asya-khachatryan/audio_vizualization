public class Demo {
    public static void main(String[] args) {
        ArrList<Integer> list1 = new ArrList<>();
        for (int i = 0; i < 15; i++) {
            list1.add(i);
        }

        System.out.println(list1.contains(12));

        System.out.println(list1.size());
        System.out.println(list1.toString());

        list1.remove(14);

        System.out.println(list1.toString());
        System.out.println(list1.get(3));


        LinkList<Integer> list2 = new LinkList<>();

        System.out.println(list2.isEmpty());

        for (int i = 0; i < 15; i++) {
            list2.add(i);
        }
        System.out.println(list2.isEmpty());


        System.out.println(list2.contains(12));

        System.out.println(list2.size());
        System.out.println(list2.toString());

        list2.remove(14);

        System.out.println(list2.toString());
        System.out.println(list2.get(3));


    }

}
