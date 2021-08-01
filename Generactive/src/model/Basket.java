package model;

import java.util.ArrayList;
import java.util.List;

public class Basket {
    private List<Item> items;

    public Basket() {
        this.items = new ArrayList<>();
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void removeItem(Item item) {
        items.remove(item);
    }

//    public double calculateTotalPrice() {
//        int sum = 0;
//        for (Item item : items) {
//            sum += item.calculatePrice();
//        }
//        return sum;
//    }
}
