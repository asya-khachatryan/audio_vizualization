package model;

public class Item {
    private int id;
    private int price;
    private String currency;
    private String name;
    private Group parent;

    public Item(int id, int price, String currency, String name, Group parent) {
        this.id = id;
        this.price = price;
        this.currency = currency;
        this.name = name;
        this.parent = parent;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
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

    @Override
    public String toString() {
        return "    * Item ID: " + id + " - " + name + " - costs " + price + " " + currency;
    }
}
