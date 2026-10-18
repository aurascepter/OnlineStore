
public class Movie extends ItemForSale {
    private String creatorName;
    private int durationMinutes;

    public Movie(String name, String creatorName,
                 int durationMinutes, String datePlacedOnSale,
                 double priceOfItem) {
        super(name, priceOfItem, datePlacedOnSale);
        this.creatorName = creatorName;
        this.durationMinutes = durationMinutes;
    }

    public int getDurationMinutes() {
        return durationMinutes;
    }

    @Override
    public String getCreatorName() {
        return creatorName;
    }

    @Override
    public String toString() {
        return super.toString()
                + " | Creator: " + creatorName
                + " | Duration: " + durationMinutes + " minutes";
    }
}