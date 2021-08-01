import model.Group;
import model.Item;
import util.CsvReader;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Demo {

    public static void main(String[] args) {
        Group group1 = new Group("Group1");
        Group group2 = new Group("Group2");
        Group group3 = new Group("Group3");

        Storage.addGroup(group1);
        Storage.addGroup(group2);
        Storage.addGroup(group3);

        File fileName = new File("src/main/resources/item.csv");
        List<String> list = CsvReader.readFromFile(fileName);

        List<Item> items = new ArrayList<>();
        for (String line: list) {
            String[] data = line.split(",");
            int price = Integer.parseInt(data[1]);
            String name = data[2];
            String url = data[3];
            int groupId = Integer.parseInt(data[4]);
            Item item = new Item(price, name);
            item.setImageUrl(url);
            item.setParent(Storage.findItemParent(groupId));
            items.add(item);
        }

        Storage.saveAllItems(items);

        for (Item item: Storage.getAllItems()) {
            System.out.println(item);
        }

    }
}
