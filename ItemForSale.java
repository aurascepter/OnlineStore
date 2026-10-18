
public class ItemForSale {
    protected String name;
    protected double priceOfItem;
    protected String datePlacedOnSale;

    public ItemForSale(String name, double priceOfItem,
                       String datePlacedOnSale) {
        this.name = name;
        this.priceOfItem = priceOfItem;
        this.datePlacedOnSale = datePlacedOnSale;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return priceOfItem;
    }

    public String getDatePlacedOnSale() {
        return datePlacedOnSale;
    }

    public String getCreatorName() {
        return "Creator information unavailable";
    }

    @Override
    public String toString() {
        return name + " - $" + String.format("%.2f", priceOfItem);
    }
}