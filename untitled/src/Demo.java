import model.Group;
import model.Item;

import java.util.Scanner;

public class Demo {
    private static final Scanner sc = new Scanner(System.in);

    private static Group makeGroup() {
        System.out.println("Please write the name of a group");
        String groupName = sc.nextLine();
        System.out.println("And an ID for it");
        int groupId = sc.nextInt();
        Group group = new Group(groupId, groupName);
        Storage.getAllGroups().add(group);
        return group;
    }

    private static Item makeItem(Group group) {
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
        return item;
    }

    public static void main(String[] args) {
        Group group = makeGroup();
        while (!sc.nextLine().equalsIgnoreCase("Continue")) {
            System.out.println("Enter the ID of its parent group or hit \"Enter\" to create a root-level group " +
                    "or type \"Continue\" to create an item");
            if (sc.hasNextInt()) {
                int parentId = sc.nextInt();
                sc.nextLine();
                Group parent = Storage.findParent(parentId);
                parent.addGroup(group);
                group = makeGroup();
                continue;
            } else if (sc.nextLine().equalsIgnoreCase("Enter")) {
                group.setParent(null);
                group = makeGroup();
                continue;
            } else {
                break;
            }
        }
        while (!sc.nextLine().equalsIgnoreCase("Exit")) {
            Item item = makeItem(group);
            group.addItem(item);

            if (sc.nextLine().equalsIgnoreCase("Exit")) {
                break;
            }
        }

        //TODO: print the hierarchy
        System.exit(0);
    }
}
