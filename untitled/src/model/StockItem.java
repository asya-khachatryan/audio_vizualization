package model;

public class StockItem extends Item {

    public StockItem(int id, int price, String currency, String name,
                     Group parent, Configuration configuration) {
        super(id, price, currency, name, parent, configuration);
    }

    public double calculatePrice() {
        return this.getPrice() * this.getConfiguration().getResolutionCoefficient();
    }
}
