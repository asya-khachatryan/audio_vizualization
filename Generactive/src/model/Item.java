package model;

public class Item {
    private static int idSequence = 0;

    private int id;
    private int price;
    private String currency;
    private String name;
    private String imageUrl;
    private Group parent;
    private Configuration configuration;

    public Item(int price, String name) {
        this.id = ++idSequence;
        ;
        this.price = price;
        this.name = name;
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

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    @Override
    public String toString() {
        return "* Item ID: " + id + " - " + name + " - costs " + price + " : Group " + parent.getId();
    }

    public String printContent() {
        return this.toString();
    }

    public double calculatePrice() {
        return this.getPrice() * this.getConfiguration().getResolution().getCoefficient();
    }

    public void print() {
        System.out.printf("ITEM(%s) - id: {%d} {%s} {%d}%n",
                this.getClass().getSimpleName(), id, name, price);
    }
}
