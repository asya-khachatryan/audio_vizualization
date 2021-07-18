import model.Configuration;
import model.Group;
import model.Item;

import java.util.ArrayList;
import java.util.List;

public class Storage {
    private static List<Group> allGroups = new ArrayList<>();
    private static List<Item> allItems = new ArrayList<>();
    private static List<Item> basket = new ArrayList<>();

    private Storage() {
    }

    public static List<Group> getAllGroups() {
        return allGroups;
    }

    public static List<Item> getAllItems() {
        return allItems;
    }

    public static List<Item> getBasket() {
        return basket;
    }

    public static Group findParent(int parentId) {
        for (int i = 0; i < allGroups.size(); i++) {
            if (parentId == allGroups.get(i).getId()) {
                return allGroups.get(i);
            }
        }
        return null;
    }

    public static Group makeGroup(String groupName) {
        Group group = new Group(groupName);
        Storage.getAllGroups().add(group);
        return group;
    }

    public static Item makeItem(int itemId, int price, String currency,
                                String itemName, Group group, Configuration configuration) {
        Item item = new Item(itemId, price, currency, itemName, group, configuration);
        group.addItem(item);
        Storage.getAllItems().add(item);
        return item;
    }

    public static void printContent() {
        for (Group group : allGroups) {
            group.printContent();
        }
    }

    public static double basketPrice() {
        int sum = 0;
        for (Item item : basket) {
            sum += item.calculatePrice();
        }
        return sum;
    }

}
