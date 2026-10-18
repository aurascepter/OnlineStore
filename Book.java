
public class Book extends ItemForSale {
    private Author author;
    private String publisher;

    public Book(String name, Author author, String publisher,
                String datePlacedOnSale, double priceOfItem) {
        super(name, priceOfItem, datePlacedOnSale);
        this.author = author;
        this.publisher = publisher;
    }

    public Author getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }

    @Override
    public String getCreatorName() {
        return author.getName();
    }

    @Override
    public String toString() {
        return super.toString()
                + " | Author: " + author.getName()
                + " | Publisher: " + publisher;
    }
}