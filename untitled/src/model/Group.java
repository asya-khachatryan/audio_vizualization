package model;

import java.util.ArrayList;
import java.util.List;

public class Group {
    private int id;
    private String name;
    private Group parent;
    private List<Item> items;
    private List<Group> subGroups;

    public Group(int id, String name, Group parent) {
        this.id = id;
        this.name = name;
        this.parent = parent;
        this.items = new ArrayList<>();
        this.subGroups = new ArrayList<>();
    }

    public Group(int id, String name) {
        this.id = id;
        this.name = name;
        this.parent = null;
        this.items = new ArrayList<>();
        this.subGroups = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Group getParent() {
        return parent;
    }

    public void setParent(Group parent) {
        this.parent = parent;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public List<Group> getSubGroups() {
        return subGroups;
    }

    public void setSubGroups(List<Group> subGroups) {
        this.subGroups = subGroups;
    }

    @Override
    public String toString() {
        if (this.parent == null) {
            return "Group " + id + " " + name;
        } else {
            return "  - " + id + ". " + name;
        }
    }

    public String printContent() {
        return "hey";
    }

    public void addGroup(Group group) {
        subGroups.add(group);
        group.setParent(this);
    }

    public void addItem(Item item) {
        items.add(item);
        item.setParent(this);
    }


}
