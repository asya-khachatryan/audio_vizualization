package model;

public class GenerativeItem extends Item {
    private final double complexity;

    public GenerativeItem(int price, String currency, String name, Group parent, Configuration configuration) {
        super(price, currency, name, parent, configuration);
        this.complexity = Math.random() + 1;
    }

    public double calculatePrice() {
        return this.getPrice() * this.getConfiguration().getResolution().getCoefficient() * this.complexity;
    }
}
