import model.Group;
import model.Item;

import java.util.Scanner;

public class Demo {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Please write the name of a group");
        Group group = Storage.makeGroup(sc.nextLine());
        while (!sc.nextLine().equalsIgnoreCase("Continue")) {
            System.out.println("Enter the ID of its parent group or hit \"Enter\" to create a root-level group " +
                    "or type \"Continue\" to create an item");
            if (sc.hasNextInt()) {
                int parentId = sc.nextInt();
                sc.nextLine();
                Group parent = Storage.findParent(parentId);
                parent.addGroup(group);
                System.out.println("Please write the name of a group");
                group = Storage.makeGroup(sc.nextLine());
                continue;
            } else if (sc.nextLine().equalsIgnoreCase("Enter")) {
                group.setParent(null);
                System.out.println("Please write the name of a group");
                group = Storage.makeGroup(sc.nextLine());
                continue;
            } else {
                break;
            }
        }
        while (!sc.nextLine().equalsIgnoreCase("Exit")) {
            System.out.println("Enter the name of the item");
            String itemName = sc.nextLine();
            System.out.println("ID for it");
            int itemId = sc.nextInt();
            System.out.println("The price currency");
            String currency = sc.nextLine();
            System.out.println("And the amount");
            int price = sc.nextInt();
            Storage.makeItem(itemId, price, currency, itemName, group);

            if (sc.nextLine().equalsIgnoreCase("Exit")) {
                break;
            }
        }

        //TODO: print the hierarchy
        System.exit(0);
    }
}
