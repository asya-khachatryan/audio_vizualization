import model.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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

    public static Group findItemParent(int groupId) {
        return getAllGroups()
                .stream()
                .filter(group -> group.getId() == groupId)
                .findAny()
                .orElse(null);
    }

    public static Group findParent(int parentId) {
        return getAllGroups()
                .stream()
                .filter(group -> group.getId() == parentId)
                .findAny()
                .orElse(null);
    }

    public static Group findGroupByName(String name) {
        return getAllGroups()
                .stream()
                .filter(group -> group.getName().equals(name))
                .findAny()
                .orElse(null);
    }

    public static List<Group> findSubGroupsByParent(int parentId) {
        return getAllGroups()
                .stream()
                .filter(group -> group.getParent().getId() == parentId)
                .collect(Collectors.toList());
    }

    public static Item findItemByTitle(String name) {
        return getAllItems()
                .stream()
                .filter(item -> item.getName().equals(name))
                .findAny()
                .orElse(null);
    }

    public static Item findHighestPricedItem() {
        int highestPrice = getAllItems()
                .stream()
                .mapToInt(item -> item.getPrice())
                .max()
                .getAsInt();
        return getAllItems()
                .stream()
                .filter(item -> item.getPrice() == highestPrice)
                .findAny()
                .get();
    }

    public static void addGroup(Group group) {
        allGroups.add(group);
    }

    public static void addItem(Item item) {
        allItems.add(item);
    }

    public static void saveAllItems (List<Item> items){
        for (Item item: items) {
            addItem(item);
        }
    }


    // TODO: change the commented methods
//    public static Group makeGroup(String groupName) {
//        Group group = new Group(groupName);
//        allGroups.add(group);
//        return group;
//    }
//
//    public static Item makeItem(int price, String itemName) {
//        StockItem item = new StockItem(price, itemName);
//        group.addItem(item);
//        allItems.add(item);
//        return item;
//    }

    public static void printContent() {
        for (Group group : allGroups) {
            group.print(0);
        }
    }


}
