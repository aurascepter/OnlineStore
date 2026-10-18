
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(
            new InputStreamReader(System.in)
        );

        Store s = new Store();
        Book b = new Book();
        
        //Input must be either a movie (Star Wars, Jumanji, or Obsession),
        //Input could also be a book (The Great Gatsby, Frankenstein)
        System.out.println("What do you want to add, sell");

        String input = reader.readLine();

        while (input != null && !input.equals("exit")) {

            if (input.equals("showItems")) {
                System.out.println(s.showItems());
            }
            else if (input.contains("addItem")) {
                System.out.println("adding " + s.addItem(input.substring(8)));
            }
            else if (input.startsWith("sellItem ")) {
               String itemName = input.substring(9).trim();
               s.sellItem(itemName);

            }
            else if (input.equals("creator")) {
                // Add creator logic here
            }

            input = reader.readLine();
        }
    }
}