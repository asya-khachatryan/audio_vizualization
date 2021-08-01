import model.Group;
import model.Item;

import java.io.*;

public class Demo {

    public static void main(String[] args) {
        Group group1 = new Group("Group1");
        Group group2 = new Group("Group2");
        Group group3 = new Group("Group3");

        Storage.addGroup(group1);
        Storage.addGroup(group2);
        Storage.addGroup(group3);

        File myObj = new File("src/main/resources/item.csv");
        Storage.readFromFile(myObj);

        for (Item item: Storage.getAllItems()) {
            System.out.println(item);
        }

    }
}
