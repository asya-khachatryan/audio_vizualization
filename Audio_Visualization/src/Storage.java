import model.Group;
import model.Item;

import java.util.ArrayList;
import java.util.List;

public class Storage {
    private static List<Group> allGroups = new ArrayList<>();
    private static List<Item> allItems = new ArrayList<>();

    private Storage() {
    }

    public static List<Group> getAllGroups() {
        return allGroups;
    }

    public static List<Item> getAllItems() {
        return allItems;
    }

    public static Group findParent(int parentId) {
        for (int i = 0; i < allGroups.size(); i++) {
            if (parentId == allGroups.get(i).getId()){
                return allGroups.get(i);
            }
        }
        return null;
    }
}
