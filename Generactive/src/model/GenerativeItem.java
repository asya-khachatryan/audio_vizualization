package model;

public class GenerativeItem extends Item {
    private final double complexity;

    public GenerativeItem(int price, String name, double complexity) {
        super(price, name);
        this.complexity = Math.random() + 1;
    }

    public double calculatePrice() {
        return this.getPrice() * this.getConfiguration().getResolution().getCoefficient() * this.complexity;
    }
}
