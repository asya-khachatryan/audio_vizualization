import model.Basket;
import model.Configuration;
import model.Group;
import model.Item;

import java.util.ArrayList;
import java.util.List;

public class Storage {
    private static final List<Group> allGroups = new ArrayList<>();
    private static final List<Item> allItems = new ArrayList<>();
    private static final List<Basket> allBaskets = new ArrayList<>();

    private Storage() {
    }

    public static List<Group> getAllGroups() {
        return allGroups;
    }

    public static List<Item> getAllItems() {
        return allItems;
    }

    public static List<Basket> getBasket() {
        return allBaskets;
    }

    public static Group findParent(int parentId) {
        for (Group group : allGroups) {
            if (parentId == group.getId()) {
                return group;
            }
        }
        return null;
    }

    public static Group makeGroup(String groupName) {
        Group group = new Group(groupName);
        allGroups.add(group);
        return group;
    }

    public static Item makeItem(int price, String currency,
                                String itemName, Group group, Configuration configuration) {
        Item item = new Item(price, currency, itemName, group, configuration);
        group.addItem(item);
        allItems.add(item);
        return item;
    }

    public static void printContent() {
        for (Group group : allGroups) {
            group.printContent();
        }
    }

}
