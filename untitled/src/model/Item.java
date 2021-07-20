package model;

public class Item {
    private static int idSequence = 0;

    private int id;
    private int price;
    private String currency;
    private String name;
    private Group parent;
    private Configuration configuration;

    public Item(int price, String currency, String name, Group parent, Configuration configuration) {
        this.id = ++idSequence;
        this.price = price;
        this.currency = currency;
        this.name = name;
        this.parent = parent;
        this.configuration = configuration;
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

    public Configuration getConfiguration() {
        return configuration;
    }

    public void setConfiguration(Configuration configuration) {
        this.configuration = configuration;
    }

    @Override
    public String toString() {
        return "    * Item ID: " + id + " - " + name + " - costs " + price + " " + currency;
    }

    public String printContent() {
        return this.toString();
    }

    public double calculatePrice() {
        return this.getPrice() * this.getConfiguration().getResolution().getCoefficient();
    }
}
