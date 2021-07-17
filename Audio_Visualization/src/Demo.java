import model.Group;
import model.Item;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Please write the name of a group");
            String groupName = sc.nextLine();
            System.out.println("And an ID for it");
            int groupId = sc.nextInt();
            Group group = new Group(groupId, groupName);
            Storage.getAllGroups().add(group);
            while (!sc.nextLine().equals("Exit")) {
                System.out.println("Enter the ID of its parent group or hit \"Enter\" to create a root-level group " +
                        "or type \"Continue\" to create an item");
                if (sc.hasNextInt()) {
                    int parentId = sc.nextInt();
                    Group parent = Storage.findParent(parentId);
                    parent.addGroup(group);
                    continue;
                } else if (sc.nextLine().equals("Continue")) {
                    System.out.println("Enter the name of the item");
                    String itemName = sc.nextLine();
                    System.out.println("ID for it");
                    int itemId = sc.nextInt();
                    System.out.println("The price currency");
                    String currency = sc.nextLine();
                    System.out.println("And the amount");
                    int price = sc.nextInt();
                    Item item = new Item(itemId, price, currency, itemName, group);
                    group.addItem(item);
                    Storage.getAllItems().add(item);
                    continue;
                } else {
                    group.setParent(null);
                    continue;
                }
            }

            System.out.println("The hierarchy");
            System.exit(0);

        }
    }
}
