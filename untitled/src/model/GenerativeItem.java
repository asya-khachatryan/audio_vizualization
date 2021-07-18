package model;

public class GenerativeItem extends Item {
    private double complexity;

    public GenerativeItem(int id, int price, String currency, String name,
                          Group parent, Configuration configuration) {
        super(id, price, currency, name, parent, configuration);
        this.complexity = Math.random() + 1;

    }

    public double calculatePrice() {
        return this.getPrice() * this.getConfiguration().getResolutionCoefficient() * this.complexity;
    }
}
