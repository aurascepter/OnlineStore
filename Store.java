
import java.util.ArrayList;
import java.time.LocalDate;

public class Store {
    private ArrayList<ItemForSale> catalog;
    private ArrayList<ItemForSale> items;
    private double profitAmount;

    public Store() {
        catalog = new ArrayList<>();
        items = new ArrayList<>();
        profitAmount = 0.0;

        String saleDate = LocalDate.now().toString();

        // Books
        Author maryShelley =
                new Author("Mary Shelley", "1797");
        Author scottFitzgerald =
                new Author("F. Scott Fitzgerald", "1896");
        Author chrisVanAllsburg =
                new Author("Chris Van Allsburg", "1949");

        catalog.add(new Book(
                "Frankenstein", maryShelley,
                "Lackington, Hughes, Harding, Mavor & Jones",
                saleDate, 6.00));

        catalog.add(new Book(
                "The Great Gatsby", scottFitzgerald,
                "Charles Scribner's Sons",
                saleDate, 9.00));

        catalog.add(new Book(
                "Jumanji", chrisVanAllsburg,
                "Houghton Mifflin",
                saleDate, 15.00));

        // Movies
        catalog.add(new Movie(
                "Star Wars", "George Lucas",
                121, saleDate, 13.00));

        catalog.add(new Movie(
                "Obsession", "Curry Barker",
                0, saleDate, 25.00));
    }

    public String showItems() {
        if (items.isEmpty()) {
            return "No items are currently available.";
        }

        String result = "Items available for sale:\n";

        for (ItemForSale item : items) {
            result += item.toString() + "\n";
        }

        return result;
    }

    public String addItem(String itemName) {
        for (ItemForSale item : catalog) {
            if (item.getName().equalsIgnoreCase(itemName)) {
                for (ItemForSale available : items) {
                    if (available.getName().equalsIgnoreCase(itemName)) {
                        return itemName + " is already available.";
                    }
                }

                items.add(item);
                return itemName + " added successfully.";
            }
        }

        return "Item not recognized.";
    }

    public boolean sellItem(String itemName) {
        for (int i = 0; i < items.size(); i++) {
            ItemForSale item = items.get(i);

            if (item.getName().equalsIgnoreCase(itemName)) {
                profitAmount += item.getPrice();
                items.remove(i);
                return true;
            }
        }

        return false;
    }

    public String creator(String itemName) {
        for (ItemForSale item : catalog) {
            if (item.getName().equalsIgnoreCase(itemName)) {
                return "Creator of " + item.getName() + ": "
                        + item.getCreatorName();
            }
        }

        return "Item not recognized.";
    }

    public double getProfitAmount() {
        return profitAmount;
    }
}